package leetcode.medium.task_2125_number_of_laser_beams_in_a_bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2125 {

    public int numberOfBeams2(String[] bank) {
        String justZeros = "0".repeat(bank[0].length());
        long[] lasers = Arrays.stream(bank)
                .filter(s -> !s.equals(justZeros))
                .mapToLong(s -> s.chars().filter(c -> c == '1').count())
                .toArray();
        long totalBeams = 0;
        for (int i = 0; i < lasers.length - 1; i++) {
            totalBeams += (lasers[i] * lasers[i + 1]);
        }
        return (int) totalBeams;
    }

    public int numberOfBeams(String[] bank) {
        int total = 0;

        List<Integer> lasers = new ArrayList<>(bank.length);
        for (String line : bank) {
            int count = getLaserCount(line);
            if (count != 0) {
                lasers.add(count);
            }
        }
        for (int j = 0; j < lasers.size() - 1; j++) {
            total += (lasers.get(j) * lasers.get(j + 1));
        }

        return total;
    }

    private int getLaserCount(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}

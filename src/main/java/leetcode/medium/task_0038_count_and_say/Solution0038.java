package leetcode.medium.task_0038_count_and_say;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution0038 {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = pairsToString(stringToPairs(result));
        }
        return result;
    }

    private List<Pair> stringToPairs(String s) {
        List<Pair> pairs = new ArrayList<>();
        char current = s.charAt(0);
        char next;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            next = s.charAt(i);
            if (next == current) {
                count++;
            } else {
                pairs.add(new Pair(current, count));
                current = next;
                count = 1;
            }
        }
        pairs.add(new Pair(current, count));
        return pairs;
    }


    private String pairsToString(List<Pair> pairs) {
        return pairs.stream()
                .map(Pair::toString)
                .collect(Collectors.joining());

    }
}

package leetcode.task_0006.zigzag_conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Solution0006 {

    public String convert2(String s,
                           int numRows) {

        if (numRows == 1) {
            return s;
        }

        List<List<Character>> converted = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            converted.add(new ArrayList<>());
        }

        int rowIndex = 0;
        boolean directionDown = false;

        for (int i = 0; i < s.length(); i++) {
            converted.get(rowIndex).add(s.charAt(i));
            if (rowIndex == numRows - 1 || rowIndex == 0) {
                directionDown = !directionDown;
            }

            rowIndex += directionDown ? 1 : -1;
        }

        return converted.stream()
                .flatMap(Collection::stream)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

    public String convert(String s,
                          int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] converted = new StringBuilder[numRows];
        for (int i = 0; i < converted.length; i++) {
            converted[i] = new StringBuilder();
        }

        int rowIndex = 0;
        boolean directionDown = false;

        for (int i = 0; i < s.length(); i++) {

            converted[rowIndex].append(s.charAt(i));
            if (rowIndex == numRows - 1 || rowIndex == 0) {
                directionDown = !directionDown;
            }
            rowIndex += directionDown ? 1 : -1;
        }

        return Arrays.stream(converted)
                .map(StringBuilder::toString)
                .collect(Collectors.joining());

    }


}






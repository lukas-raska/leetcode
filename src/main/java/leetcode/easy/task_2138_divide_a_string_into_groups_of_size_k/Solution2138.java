package leetcode.easy.task_2138_divide_a_string_into_groups_of_size_k;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2138 {

    public String[] divideString(String s,
                                 int k,
                                 char fill) {
        return IntStream.range(0, (s.length() % k == 0) ? s.length() / k : s.length() / k + 1)
                .mapToObj(i -> s.substring(i * k, Math.min((i + 1) * k, s.length())))
                .map(str -> (str.length() < k) ? str + ("" + fill).repeat(k - str.length()) : str)
                .toArray(String[]::new);
    }


    public String[] divideString2(String s,
                                  int k,
                                  char fill) {
        int stringLength = s.length();
        int dividedLength = (stringLength % k == 0) ? stringLength / k : stringLength / k + 1;
        String[] divided = new String[dividedLength];
        int stringIdx = 0;
        int dividedIdx = 0;
        while (stringIdx < stringLength) {
            int endIndex = stringIdx + k;
            if (dividedIdx == dividedLength - 1) {
                endIndex = stringLength;
            }
            divided[dividedIdx++] = s.substring(stringIdx, endIndex);
            stringIdx += k;
        }
        int lastElementLength = divided[dividedLength - 1].length();

        if (lastElementLength < k) {
            divided[dividedLength - 1] = divided[dividedLength - 1] + ("" + fill).repeat(k - lastElementLength);
        }
        return divided;
    }
}



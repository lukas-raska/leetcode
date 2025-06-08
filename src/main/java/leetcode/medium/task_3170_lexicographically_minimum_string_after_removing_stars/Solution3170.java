package leetcode.medium.task_3170_lexicographically_minimum_string_after_removing_stars;

import java.util.*;
import java.util.stream.Collectors;

public class Solution3170 {
    //s priority queue - 184 ms
    //26 front 72 ms
    public String clearStars(String s) {
        Map<Character, Deque<Integer>> charDequeMap = new TreeMap<>(Comparator.comparing(Character::charValue));
        StringBuilder result = new StringBuilder(s.length());

        var array = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char current = array[i];
            if (current != '*') {
                if (charDequeMap.containsKey(current)) {
                    charDequeMap.get(current).push(i);
                } else {
                    Deque<Integer> deque = new LinkedList<>();
                    deque.push(i);
                    charDequeMap.put(current, deque);
                }
            } else {
                charDequeMap.entrySet().stream()
                        .filter(e -> !e.getValue().isEmpty())
                        .findFirst()
                        .ifPresent(e -> {
                            array[charDequeMap.get(e.getKey()).pop()] = '*';
                        });
            }
        }
        for (char c : array) {
            if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();

    }


    public String clearStars2(String s) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] != b[0]) ? a[0] - b[0] : b[1] - a[1]);
        StringBuilder result = new StringBuilder();

        var array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char current = array[i];
            if (current != '*') {
                pq.add(new int[]{current, i});
            } else {
                array[pq.poll()[1]] = '*';
            }
        }

        for (char c : array) {
            if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();

    }


    //    public String clearStars(String s) {
    //
    //        StringBuilder result = new StringBuilder();
    //        int startIndex = 0;
    //        int index = 0;
    //        char minChar = Character.MAX_VALUE;
    //        int indexOfMin = 0;
    //        boolean containsStar = false;
    //
    //        while (index < s.length()) {
    //            char current = s.charAt(index);
    //            if (current < minChar && current != '*') {
    //                minChar = current;
    //                indexOfMin = index;
    //            }
    //            if (current == minChar) {
    //                indexOfMin = index;
    //            }
    //            if (current == '*') {
    //                containsStar = true;
    //                StringBuilder sub = new StringBuilder(s.substring(startIndex, index));
    //                if (indexOfMin >= startIndex) {
    //                    sub.deleteCharAt(indexOfMin-startIndex);
    //                }
    //                result.append(sub);
    //                index++;
    //                startIndex = index;
    //                minChar = Character.MAX_VALUE;
    //
    //
    //            }else {
    //                index++;
    //            }
    //
    //        }
    //        if (startIndex<s.length()){
    //
    //            result.append(s, startIndex, s.length());
    //        }
    //
    //
    //        return containsStar ? result.toString() : s;
    //    }
}

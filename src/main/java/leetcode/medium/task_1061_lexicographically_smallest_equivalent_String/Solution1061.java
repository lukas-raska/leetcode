package leetcode.medium.task_1061_lexicographically_smallest_equivalent_String;

import java.util.*;

public class Solution1061 {

    public String smallestEquivalentString(String s1,
                                           String s2,
                                           String baseStr) {
        Map<Character, Set<Character>> equivalentsMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char fromS1 = s1.charAt(i);
            char fromS2 = s2.charAt(i);
            feedTheMap(equivalentsMap, fromS1, fromS2);
            feedTheMap(equivalentsMap, fromS2, fromS1);
        }

        StringBuilder result = new StringBuilder(baseStr.length());
        Set<Character> traversed = new HashSet<>();

        for (char c : baseStr.toCharArray()) {
            traversed.clear();
            traversed.add(c);
            char minChar = c;
            if (minChar == 'a') {
                result.append(minChar);
                continue;
            }

            if (equivalentsMap.containsKey(c)) {
                Deque<Character> queue = new LinkedList<>();
                queue.add(c);

                while (!queue.isEmpty()) {
                    char key = queue.pop();
                    var values = equivalentsMap.get(key);
                    if (values.contains('a')) {
                        minChar = 'a';
                        break;
                    }
                    for (char ch : values) {
                        if (!traversed.contains(ch)) {
                            queue.add(ch);
                        }
                    }

                    for (char v : values) {
                        traversed.add(v);
                        if (v < minChar) {
                            minChar = v;
                        }
                    }
                }
            }
            result.append(minChar);
        }
        return result.toString();
    }


    private void feedTheMap(Map<Character, Set<Character>> equivalentsMap,
                            char first,
                            char second) {
        if (equivalentsMap.containsKey(first)) {
            equivalentsMap.get(first).add(second);
        } else {
            Set<Character> equivSet = new HashSet<>();
            equivSet.add(second);
            equivalentsMap.put(first, equivSet);
        }
    }

    //    public String smallestEquivalentString2(String s1,
    //                                            String s2,
    //                                            String baseStr) {
    //        List<Set<Character>> listOfEquivalents = new ArrayList<>();
    //        Set<Character> used = new HashSet<>();
    //        for (int i = 0; i < s1.length(); i++) {
    //            char fromS1 = s1.charAt(i);
    //            char fromS2 = s2.charAt(i);
    //            used.add(fromS1);
    //            used.add(fromS2);
    //            if (listOfEquivalents.isEmpty()) {
    //                Set<Character> characterSet = new HashSet<>();
    //                characterSet.add(fromS1);
    //                characterSet.add(fromS2);
    //                listOfEquivalents.add(characterSet);
    //            } else {
    //                boolean foundMatch = false;
    //                for (var equivalentsSet : listOfEquivalents) {
    //                    if (equivalentsSet.contains(fromS1) || equivalentsSet.contains(fromS2)) {
    //                        equivalentsSet.add(fromS1);
    //                        equivalentsSet.add(fromS2);
    //                        foundMatch = true;
    //                    }
    //                }
    //                if (!foundMatch) {
    //                    Set<Character> characterSet = new HashSet<>();
    //                    characterSet.add(fromS1);
    //                    characterSet.add(fromS2);
    //                    listOfEquivalents.add(characterSet);
    //                }
    //            }
    //        }
    //        var usedChars = used.toArray(Character[]::new);
    //        for (int i = 0; i < listOfEquivalents.size(); i++) {
    //
    //        }
    //
    //
    //        StringBuilder result = new StringBuilder(baseStr.length());
    //        for (char c : baseStr.toCharArray()) {
    //            char minEquiv = c;
    //            for (var equivalentSet : listOfEquivalents) {
    //                if (equivalentSet.contains(c)) {
    //                    char localMin = equivalentSet.stream().min(Character::compareTo).orElseThrow();
    //                    if (localMin < minEquiv) {
    //                        minEquiv = localMin;
    //                    }
    //                }
    //            }
    //            result.append(minEquiv);
    //        }
    //
    //        return result.toString();
    //    }
}

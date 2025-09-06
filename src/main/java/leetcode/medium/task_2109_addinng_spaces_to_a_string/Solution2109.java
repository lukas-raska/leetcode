package leetcode.medium.task_2109_addinng_spaces_to_a_string;

public class Solution2109 {

    public String addSpaces(String s,
                            int[] spaces) {

        StringBuilder result = new StringBuilder();
        int from = 0;
        for (int space: spaces){
            result.append(s, from, space).append(" ");
            from = space;
        }
        result.append(s,from,s.length());
        return result.toString();
    }
}

package leetcode.easy.task_2129_capitalize_the_title;

import java.util.StringTokenizer;

public class Solution2129 {

    public String capitalizeTitle(String title) {

       String [] words = title.split(" ");

       for(int i = 0; i < words.length; i++){
           if (words[i].length() > 2){
               words[i] = "%C%s".formatted(
                       words[i].charAt(0),
                       words[i].substring(1).toLowerCase());
           }
       }
       return String.join(" ",words);
    }
}

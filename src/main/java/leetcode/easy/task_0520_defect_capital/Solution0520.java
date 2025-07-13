package leetcode.easy.task_0520_defect_capital;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution0520 {

    public boolean detectCapitalUse2(String word) {
        return word.matches("([A-Z]+)|([a-z]+)|([A-Z][a-z]+)");
    }

    public boolean detectCapitalUse3(String word) {
        boolean allUppers = word.toUpperCase().equals(word);
        boolean allLowers = word.toLowerCase().equals(word);
        boolean firstUpperRestLowers = word.charAt(0) == Character.toUpperCase(word.charAt(0))
                && word.substring(1).toLowerCase().equals(word.substring(1));
        return allUppers || allLowers || firstUpperRestLowers;
    }

//    public boolean detectCapitalUse(String word){
//        boolean firstUpper = word.charAt(0)==Character.toUpperCase(word.charAt(0));
//        for (int i = 1; i < word.length(); i++) {
//            char current = word.charAt(i);
//            boolean currentUpper = current == Character.toUpperCase(current);
//            if (firstUpper){
//
//            }else {
//                if (!currentUpper){
//                    return
//                }
//            }
//        }
//    }


}

package leetcode.easy.task_0925_long_pressed_name;

public class Solution925 {

    public boolean isLongPressedName(String name,
                                     String typed) {

        if (typed.length() < name.length()) {
            return false;
        }

        int typedIdx = 0;
        int nameIdx = 0;
        int nameCnt, typedCnt;

        while (nameIdx < name.length() || typedIdx < typed.length()) {

            char typedChar = typedIdx < typed.length()? typed.charAt(typedIdx): Character.MIN_VALUE;
            char nameChar = nameIdx < name.length()? name.charAt(nameIdx): Character.MIN_VALUE;

            if (typedChar != nameChar){
                return false;
            }

            nameCnt = 0;
            typedCnt = 0;

            while (typedIdx < typed.length() && typed.charAt(typedIdx) == typedChar) {
                typedCnt++;
                typedIdx++;
            }

            while (nameIdx < name.length() && name.charAt(nameIdx) == nameChar) {
                nameCnt++;
                nameIdx++;
            }

            if (typedCnt < nameCnt) {
                return false;
            }
        }

        return true;
    }
}

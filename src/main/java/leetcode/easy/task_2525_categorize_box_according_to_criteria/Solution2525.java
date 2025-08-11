package leetcode.easy.task_2525_categorize_box_according_to_criteria;

public class Solution2525 {

    public String categorizeBox(int length,
                                int width,
                                int height,
                                int mass) {

        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 || (long) length * width * height >= 1_000_000_000;
        boolean isHeavy = mass >= 100;

        if (isHeavy && isBulky) {
            return "Both";
        }
        if (isHeavy) {
            return "Heavy";
        }
        if (isBulky) {
            return "Bulky";
        }
        return "Neither";
    }
}

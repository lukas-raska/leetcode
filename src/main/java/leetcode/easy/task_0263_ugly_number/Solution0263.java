package leetcode.easy.task_0263_ugly_number;

import java.util.HashSet;
import java.util.Set;

public class Solution0263 {

    /*
    ugly je pokud
    - je kladné
    - nemá prvočíselné dělitele (faktory) jiné než 2,3,5

    tedy pokud najdu jiného prvočíselného dělitele, vracím false - takové číslo není ugly
    */


    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] uglyFactors = {2, 3, 5};
        for (int factor : uglyFactors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

}

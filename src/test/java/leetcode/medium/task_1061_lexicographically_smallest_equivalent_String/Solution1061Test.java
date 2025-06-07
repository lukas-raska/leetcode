package leetcode.medium.task_1061_lexicographically_smallest_equivalent_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1061Test {

    Solution1061 solution1061 = new Solution1061();

    @Test
    public void example1(){
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";
        assertEquals("makkek", solution1061.smallestEquivalentString(s1,s2,baseStr));
    }

    @Test
    public void example2(){
        String s1 = "hello";
        String s2 = "world";
        String baseStr = "hold";
        assertEquals("hdld", solution1061.smallestEquivalentString(s1,s2,baseStr));
    }

    @Test
    public void example3(){
        String s1 = "leetcode";
        String s2 = "programs";
        String baseStr = "sourcecode";
        assertEquals("aauaaaaada", solution1061.smallestEquivalentString(s1,s2,baseStr));
    }

    @Test
    public void example4(){
        String s1 = "zrr";
        String s2 = "acz";
        String baseStr = "zradce";
        assertEquals("aaadae", solution1061.smallestEquivalentString(s1,s2,baseStr));
    }

}
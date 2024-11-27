package leetcode.task_0005.longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

class Solution0005Test {

    Solution0005 solution0005 = new Solution0005();

    @Test
    void longestPalindromeTest1() {

        String[] validResults = {"bab", "aba"};

        assertTrue(Stream.of("bab", "aba")
                .anyMatch(s -> s.equals(solution0005.longestPalindrome("babad"))));
    }

    @Test
    void longestPalindromeTest2() {

        assertEquals("a", solution0005.longestPalindrome("ac"));
    }

    @Test
    void longStringTest() {
        String s = "reifadyqgztixemwswtccodfnchcovrmiooffbbijkecuvlvukecutasfxqcqygltrogrdxlrslbnzktlanycgtniprjlospzhhgdrqcwlukbpsrumxguskubokxcmswjnssbkutdhppsdckuckcbwbxpmcmdicfjxaanoxndlfpqwneytatcbyjmimyawevmgirunvmdvxwdjbiqszwhfhjmrpexfwrbzkipxfowcbqjckaotmmgkrbjvhihgwuszdrdiijkgjoljjdubcbowvxslctleblfmdzmvdkqdxtiylabrwaccikkpnpsgcotxoggdydqnuogmxttcycjorzrtwtcchxrbbknfmxnonbhgbjjypqhbftceduxgrnaswtbytrhuiqnxkivevhprcvhggugrmmxolvfzwadlnzdwbtqbaveoongezoymdrhywxcxvggsewsxckucmncbrljskgsgtehortuvbtrsfisyewchxlmxqccoplhlzwutoqoctgfnrzhqctxaqacmirrqdwsbdpqttmyrmxxawgtjzqjgffqwlxqxwxrkgtzqkgdulbxmfcvxcwoswystiyittdjaqvaijwscqobqlhskhvoktksvmguzfankdigqlegrxxqpoitdtykfltohnzrcgmlnhddcfmawiriiiblwrttveedkxzzagdzpwvriuctvtrvdpqzcdnrkgcnpwjlraaaaskgguxzljktqvzzmruqqslutiipladbcxdwxhmvevsjrdkhdpxcyjkidkoznuagshnvccnkyeflpyjzlcbmhbytxnfzcrnmkyknbmtzwtaceajmnuyjblmdlbjdjxctvqcoqkbaszvrqvjgzdqpvmucerumskjrwhywjkwgligkectzboqbanrsvynxscpxqxtqhthdytfvhzjdcxgckvgfbldsfzxqdozxicrwqyprgnadfxsionkzzegmeynye";
        assertEquals("uvlvu", solution0005.longestPalindrome(s));
    }
}
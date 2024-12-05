package leetcode.task_0015_3sum;

import leetcode.task_0015_3sum_unfinished.Solution0015;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0015Test {

    private final Solution0015 solution0015 = new Solution0015();

    @Test
    void example1() {
        List<List<Integer>> expected = List.of(
                List.of(-1,-1,2),
                List.of(-1,0,1));

        List<List<Integer>> result = solution0015.threeSum(new int[]{-1,0,1,2,-1,-4});

        assertEquals(expected,result);
    }

    @Test
    void bigDataTest(){
        try {
            var input = Files.readString(Path.of("src/main/resources/testArray_0015.txt"))
                    .split(",");
            var parsedInput = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void example3() {
        List<List<Integer>> expected = List.of(
                List.of(-2,0,2),
                List.of(-2,1,1));

        List<List<Integer>> result = solution0015.threeSum(new int[]{-2,0,1,1,2});

        assertEquals(expected,result);
    }
}
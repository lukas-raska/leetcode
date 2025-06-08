package leetcode.medium.task_0386_lexicographicalNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Solution0386 {

    public List<Integer> lexicalOrder(int n) {

        return IntStream
                .rangeClosed(0, n)
                .boxed()
                .sorted(Comparator.comparing(String::valueOf))
                .toList();
    }


}

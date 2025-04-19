package leetcode.task_0038_count_and_say;

public class Pair {

    private final char value;
    private final int count;

    public Pair(char value,
                int count) {
        this.value = value;
        this.count = count;
    }

    @Override
    public String toString() {
        return "" + count + value;
    }
}

package leetcode.medium.task_0165_compare_version_numbers;

public class Solution0165 {

    public int compareVersion(String version1,
                              String version2) {

        int[] parsed1 = parse(version1);
        int[] parsed2 = parse(version2);
        for (int i = 0; i < Math.max(parsed1.length, parsed2.length); i++) {
            int num1 = (i < parsed1.length) ? parsed1[i] : 0;
            int num2 = (i < parsed2.length) ? parsed2[i] : 0;
            int cmp = Integer.compare(num1, num2);
            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }

    private int[] parse(String version) {
        String[] split = version.split("\\.");
        int[] parsed = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            parsed[i] = Integer.parseInt(split[i]);
        }
        return parsed;
    }
}

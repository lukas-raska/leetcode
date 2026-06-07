package leetcode.medium.task_2196_create_binary_tree_from_descriptions;

import java.util.*;
import java.util.function.BiFunction;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {this.val = val;}

    TreeNode(int val,
             TreeNode left,
             TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution2196 {

    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> treeNodeMap = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        TreeNode root = null;

        for (int[] d : descriptions) {

            int parent = d[0];
            int child = d[1];
            boolean isLeft = d[2] == 1;
            children.add(child);

            treeNodeMap.putIfAbsent(parent, new TreeNode(parent));
            treeNodeMap.putIfAbsent(child, new TreeNode(child));

            if (isLeft) {
                treeNodeMap.get(parent).left = treeNodeMap.get(child);
            } else {
                treeNodeMap.get(parent).right = treeNodeMap.get(child);
            }
        }

        for (int parentValue : treeNodeMap.keySet()) {
            if (!children.contains(parentValue)) {
                root = treeNodeMap.get(parentValue);
                break;
            }
        }
        return root;
    }


}

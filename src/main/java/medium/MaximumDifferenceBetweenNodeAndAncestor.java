package medium;

import common.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    // https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
    public int maxAncestorDiff(TreeNode root) {
        return Math.max(maxDiff(root.left, root.val, root.val), maxDiff(root.right, root.val, root.val));
    }

    private int maxDiff(TreeNode node, int max, int min) {
        if (node == null) return 0;
        int n = Math.max(Math.abs(max - node.val), Math.abs(min - node.val));
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        return Math.max(n, Math.max(maxDiff(node.left, max, min), maxDiff(node.right, max, min)));
    }
}

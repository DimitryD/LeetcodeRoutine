package medium;

import common.TreeNode;

public class LowestCommonAncestorOfDeepestLeaves {
    // https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
    private int maxDepth;
    private TreeNode lca;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        maxDepth = 0;
        lca = root;
        helper(root, 0);
        return lca;
    }

    private int helper(TreeNode root, int depth) {
        maxDepth = Math.max(maxDepth, depth);
        if (root == null) return depth;
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth + 1);
        if (left == maxDepth && right == maxDepth)
            lca = root;
        return Math.max(left, right);
    }
}

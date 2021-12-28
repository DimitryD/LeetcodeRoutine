package easy;

import common.TreeNode;

public class PathSum {
    // https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return matchPathSum(root, targetSum);
    }

    private boolean matchPathSum(TreeNode node, int targetSum) {
        if (node == null) return false;
        if (node.left == null && node.right == null)
            return targetSum - node.val == 0;
        return matchPathSum(node.left, targetSum - node.val) || matchPathSum(node.right, targetSum - node.val);
    }
}

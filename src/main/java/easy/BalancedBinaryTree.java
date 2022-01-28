package easy;

import common.TreeNode;

public class BalancedBinaryTree {
    // https://leetcode.com/problems/balanced-binary-tree/
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return getTreeHeight(root) != -1;
    }

    private int getTreeHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

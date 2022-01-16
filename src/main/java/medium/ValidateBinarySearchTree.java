package medium;

import common.TreeNode;

public class ValidateBinarySearchTree {
    // https://leetcode.com/problems/validate-binary-search-tree/
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBST(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validateBST(node.left, min, node.val)
                && validateBST(node.right, node.val, max);
    }
}

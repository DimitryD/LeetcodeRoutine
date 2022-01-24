package medium;

import common.TreeNode;

public class BinaryTreePruning {
    // https://leetcode.com/problems/binary-tree-pruning/
    public TreeNode pruneTree(TreeNode root) {
        if (pruning(root)) return null;
        return root;
    }

    boolean pruning(TreeNode root) {
        if (root == null) return true;
        boolean pruneLeft = pruning(root.left);
        if (pruneLeft) root.left = null;
        boolean pruneRight = pruning(root.right);
        if (pruneRight) root.right = null;
        return pruneLeft && pruneRight && root.val == 0;
    }
}

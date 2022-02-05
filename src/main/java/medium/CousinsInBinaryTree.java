package medium;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CousinsInBinaryTree {
    // https://leetcode.com/problems/cousins-in-binary-tree/
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y) return false;
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        TreeNode parentX = null, parentY = null;
        while (!nodes.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<>(nodes);
            nodes.clear();
            for (TreeNode node: levelNodes) {
                if (node.left != null) {
                    if (node.left.val == x) parentX = node;
                    if (node.left.val == y) parentY = node;
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    if (node.right.val == x) parentX = node;
                    if (node.right.val == y) parentY = node;
                    nodes.add(node.right);
                }
            }
            if (parentX != null && parentY != null && parentX != parentY) return true;
            if ((parentX != null &&  parentY == null) || (parentX == null &&  parentY != null)) return false;
        }
        return false;
    }
}

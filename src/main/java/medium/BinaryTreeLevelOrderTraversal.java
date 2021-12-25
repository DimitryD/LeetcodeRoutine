package medium;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        // nodes to visit on the next level;
        Queue<TreeNode> nodes = new ArrayDeque<>();
        // add root to start traversal
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<>(nodes);
            nodes.clear();
            List<Integer> level = new ArrayList<>();
            for (TreeNode node: levelNodes) {
                level.add(node.val);
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
}

package medium;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfBinaryTree {
    // https://leetcode.com/problems/check-completeness-of-a-binary-tree/
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        boolean end = false;
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            if (node == null) end = true;
            else if (end) return false;
            else {
                nodes.add(node.left);
                nodes.add(node.right);
            }
        }
        return true;
    }
}

package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    // https://leetcode.com/problems/leaf-similar-trees/
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaves = new ArrayList<>();
        List<Integer> root2Leaves = new ArrayList<>();
        collectLeaves(root1, root1Leaves);
        collectLeaves(root2, root2Leaves);
        return root1Leaves.equals(root2Leaves);
    }

    private void collectLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) return;
        if (node.left == null && node.right == null) leaves.add(node.val);
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}

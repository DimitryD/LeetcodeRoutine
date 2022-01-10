package medium;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {
    // https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int max = root.val;
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        int currentLevel = 1;
        while (!nodes.isEmpty()) {
            int levelNodesNumber = nodes.size();
            int levelSum = 0;
            for (int i = 0; i < levelNodesNumber; i++) {
                TreeNode node = nodes.poll();
                levelSum += node.val;
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
            if (levelSum > max) {
                max = levelSum;
                level = currentLevel;
            }
            currentLevel++;
        }
        return level;
    }
}

package easy;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    // https://leetcode.com/problems/average-of-levels-in-binary-tree/
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<>(nodes);
            long levelSum = 0, nodesNumber = levelNodes.size();
            nodes.clear();
            for (TreeNode node: levelNodes) {
                levelSum += node.val;
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
            averages.add(levelSum * 1.0 / nodesNumber);
        }

        return averages;
    }
}

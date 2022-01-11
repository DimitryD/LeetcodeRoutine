package easy;

import common.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    // https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
    public int sumRootToLeaf(TreeNode root) {
        return sumToNode(root, "");
    }

    public int sumToNode(TreeNode node, String path) {
        StringBuilder pathToNode = new StringBuilder(path);
        pathToNode.append(node.val);
        if (node.right == null && node.left == null) return Integer.parseInt(pathToNode.toString(), 2);
        int nodeSum = 0;
        if (node.left != null) nodeSum += sumToNode(node.left, pathToNode.toString());
        if (node.right != null) nodeSum += sumToNode(node.right, pathToNode.toString());
        return nodeSum;
    }
}

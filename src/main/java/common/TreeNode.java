package common;

import java.util.*;

//  Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // does not support shorten representation of tree
    public TreeNode(Integer[] nodes) {
        this.val = nodes[0];
        this.left = insertLevelOrder(nodes, 1); // 2 * index + 1 == 2 * 0 + 1 == 1
        this.right = insertLevelOrder(nodes, 2); // 2 * index + 2 == 2 * 0 + 2 == 2
    }

    public TreeNode insertLevelOrder(Integer[] nodes, int index) {
        TreeNode node = null;
        if (index < nodes.length && nodes[index] != null) {
            node = new TreeNode(nodes[index]);
            node.left = insertLevelOrder(nodes, 2 * index + 1);
            node.right = insertLevelOrder(nodes, 2 * index + 2);
        }
        return node;
    }

    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder result = new StringBuilder();
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty() && nodes.stream().anyMatch(Objects::nonNull)) {
            List<TreeNode> levelNodes = new ArrayList<>(nodes);
            nodes.clear();
            for (TreeNode node: levelNodes) {
                if (node != null) {
                    result.append(node.val);
                    result.append(',');
                    nodes.add(node.left);
                    nodes.add(node.right);
                } else {
                    result.append("null,");
                }
            }
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }

    public static TreeNode deserialize(String data) {
        if ("".equals(data)) return null;
        Integer[] nodes = new Integer[data.split(",").length];
        int pointer = 0;
        for (String node: data.split(",")) {
            if ("null".equals(node)) nodes[pointer] = null;
            else nodes[pointer] = Integer.valueOf(node);
            pointer++;
        }
        TreeNode root = new TreeNode(nodes[0]);
        List<TreeNode> parentLevelNodes = new LinkedList<>();
        parentLevelNodes.add(root); // add root node/level
        int index = 1;
        while (!parentLevelNodes.isEmpty() && index < nodes.length) {
            LinkedList<TreeNode> currentLevelNodes = new LinkedList<>();
            for (TreeNode parentNode: parentLevelNodes) {
                if (nodes[index] != null) {
                    TreeNode leftNode = new TreeNode(nodes[index]);
                    parentNode.left = leftNode;
                    currentLevelNodes.add(leftNode);
                }

                if (nodes[index + 1] != null) {
                    TreeNode rightNode = new TreeNode(nodes[index + 1]);
                    parentNode.right = rightNode;
                    currentLevelNodes.add(rightNode);
                }

                index += 2;
            }
            parentLevelNodes.clear();
            parentLevelNodes.addAll(currentLevelNodes);
        }
        return root;
    }

}

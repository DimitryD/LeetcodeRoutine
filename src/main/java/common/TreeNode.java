package common;

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
}

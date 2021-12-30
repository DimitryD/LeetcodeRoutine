package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        if (inorder.length == 1) return new TreeNode(inorder[0]);
        int m = postorder.length;
        TreeNode root = new TreeNode(postorder[m - 1]);
        List<Integer> inorderLeft = new ArrayList<>();
        List<Integer> inorderRight = new ArrayList<>();
        List<Integer> postorderLeft = new ArrayList<>();
        List<Integer> postorderRight = new ArrayList<>();
        int i = 0;
        for (; inorder[i] != postorder[m - 1]; i++) inorderLeft.add(inorder[i]);
        int k = 0;
        for (; k < i; k++) postorderLeft.add(postorder[k]);
        for (int j = i + 1; j < m; j++) inorderRight.add(inorder[j]);
        for (int l = 0; l + k < m - 1; l++) postorderRight.add(postorder[l + k]);
        root.left = buildTree(inorderLeft.stream().mapToInt(in -> in).toArray(), postorderLeft.stream().mapToInt(in -> in).toArray());
        root.right = buildTree(inorderRight.stream().mapToInt(in -> in).toArray(), postorderRight.stream().mapToInt(in -> in).toArray());
        return root;
    }
}

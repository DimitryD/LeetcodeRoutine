package medium;

import common.TreeNode;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildSubTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubTree(int[] preorder, int preStart, int preEnd,
                                  int[] inorder, int inStart, int inEnd) {
        if (inEnd < inStart || preEnd < preStart) return null;
        TreeNode subRoot = new TreeNode(preorder[preStart]);
        if (preEnd - preStart == 0) return subRoot;
        int x = -1;
        for (int i = 0; i < inorder.length; i++)
            if (inorder[i] == preorder[preStart]) {
                x = i;
                break;
            }
        subRoot.left = buildSubTree(preorder, preStart + 1, preStart + (x - inStart),
                                    inorder, inStart, x - 1);
        subRoot.right = buildSubTree(preorder, preStart + (x - inStart) + 1, preEnd,
                                    inorder, x + 1, inEnd);
        return subRoot;
    }
}

package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    // https://leetcode.com/problems/binary-tree-preorder-traversal/
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;
        answer.add(root.val);
        if (root.left != null)
            answer.addAll(preorderTraversal(root.left));
        if (root.right != null)
            answer.addAll(preorderTraversal(root.right));
        return answer;
    }
}


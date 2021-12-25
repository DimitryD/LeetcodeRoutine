package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    // https://leetcode.com/problems/binary-tree-inorder-traversal/
    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> answer = new ArrayList<>();
//        if (root == null) return answer;
//        if (root.left != null) answer.addAll(inorderTraversal(root.left));
//        answer.add(root.val);
//        if (root.right != null) answer.addAll(inorderTraversal(root.right));
//        return answer;

        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        if (root == null) return answer;

        TreeNode current = root;
        nodes.push(current);
        do {
            if (current.left != null) {
                nodes.push(current.left);
                current = current.left;
                continue;
            }
            current = nodes.pop();
            answer.add(current.val);
            if (current.right != null) {
                nodes.push(current.right);
                current = current.right;
            }
        } while (!nodes.isEmpty());
        return answer;
    }
}

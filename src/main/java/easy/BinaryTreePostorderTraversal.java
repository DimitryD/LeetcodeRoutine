package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    // https://leetcode.com/problems/binary-tree-postorder-traversal/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        if (root.left != null)
            result.addAll(postorderTraversal(root.left));
        if (root.right != null)
            result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
}

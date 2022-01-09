package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    // https://leetcode.com/problems/binary-tree-paths/
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathsToNode = new ArrayList<>();
        List<String> paths = new ArrayList<>();
        if (root.left != null) pathsToNode.addAll(binaryTreePaths(root.left));
        if (root.right != null) pathsToNode.addAll(binaryTreePaths(root.right));
        if (pathsToNode.isEmpty()) paths.add(String.valueOf(root.val));
        else
            for (String path: pathsToNode)
                paths.add(root.val + "->" + path);

        return paths;
    }
}

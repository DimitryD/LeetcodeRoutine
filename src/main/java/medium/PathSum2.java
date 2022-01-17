package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    // https://leetcode.com/problems/path-sum-ii/
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> sums = pathSums(root, new ArrayList<>());
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> sum: sums)
            if (sum.stream().mapToInt(a -> a).sum() == targetSum)
                result.add(sum);
        return result;
    }

    private List<List<Integer>> pathSums(TreeNode root, List<Integer> sum) {
        List<List<Integer>> sums = new ArrayList<>();
        if (root == null) return sums;
        List<Integer> currentPathSum = new ArrayList<>(sum);
        currentPathSum.add(root.val);
        if (root.left == null && root.right == null) sums.add(currentPathSum);
        if (root.right != null) sums.addAll(pathSums(root.right, currentPathSum));
        if (root.left != null) sums.addAll(pathSums(root.left, currentPathSum));
        return sums;
    }
}

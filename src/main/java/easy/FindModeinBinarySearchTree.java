package easy;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class FindModeinBinarySearchTree {
    // https://leetcode.com/problems/find-mode-in-binary-search-tree/
    Map<Integer, Integer> frequency;
    public int[] findMode(TreeNode root) {
        frequency = new HashMap<>();
        dfs(root);
        int max = -999999;
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet())
            max = Math.max(max, entry.getValue());
        int count = 0;
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet())
            if (entry.getValue() == max) count++;
        int[] result = new int[count];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet())
            if (entry.getValue() == max) {
                result[index] = entry.getKey();
                index++;
            }
        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        if (frequency.containsKey(root.val)) frequency.computeIfPresent(root.val, (key,value) -> value + 1);
        else frequency.put(root.val, 1);
        dfs(root.left);
        dfs(root.right);
    }
}

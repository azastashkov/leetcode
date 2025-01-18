package easy._0108;

import util.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int l, int h) {
        if (l > h) {
            return null;
        }

        int mid = l + (h - l) / 2;

        return new TreeNode(nums[mid], dfs(nums, l, mid - 1), dfs(nums, mid + 1, h));
    }
}
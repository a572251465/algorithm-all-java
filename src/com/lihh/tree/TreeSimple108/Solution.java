package com.lihh.tree.TreeSimple108;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple108
 * @Author: lihh
 * @CreateTime: 2022-09-02  07:22
 * @Description: 108. 将有序数组转换为二叉搜索树
 */
public class Solution {
    public TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) return null;

        int middleIndex = start + ((end - start) >> 1);
        TreeNode root = new TreeNode(nums[middleIndex]);

        root.left = dfs(nums, start, middleIndex - 1);
        root.right = dfs(nums, middleIndex + 1, end);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return this.dfs(nums, 0, nums.length - 1);
    }
}

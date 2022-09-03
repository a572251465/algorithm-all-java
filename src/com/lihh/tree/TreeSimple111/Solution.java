package com.lihh.tree.TreeSimple111;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple111
 * @Author: lihh
 * @CreateTime: 2022-09-03  14:19
 * @Description: 二叉树的最小深度
 */
public class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;

    int left = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
    int right = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

    return Math.min(left, right) + 1;
  }
}

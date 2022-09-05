package com.lihh.tree.TreeSimple530;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple530
 * @Author: lihh
 * @CreateTime: 2022-09-05  19:46
 * @Description: 530. 二叉搜索树的最小绝对差
 */
public class Solution {
  int min = -1, prev = 0;

  public void dfs(TreeNode root) {
    if (root == null) return;

    this.dfs(root.left);

    if (min == -1) {
      min = Integer.MAX_VALUE;
    } else {
      min = Math.min(min, root.val - prev);
    }
    prev = root.val;

    this.dfs(root.right);
  }

  public int getMinimumDifference(TreeNode root) {
    if (root == null) return 0;

    this.dfs(root);
    return min;
  }
}

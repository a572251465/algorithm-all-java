package com.lihh.tree.TreeSimple783;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple783
 * @Author: lihh
 * @CreateTime: 2022-09-08  20:34
 * @Description: TODO
 */
public class Solution {
  int min = Integer.MAX_VALUE;
  int prev = -1;

  public void dfs(TreeNode r) {
    if (r == null) return;

    this.dfs(r.left);

    if (prev != -1) {
      min = Math.min(min, r.val - prev);
    }
    prev = r.val;

    this.dfs(r.right);
  }

  public int minDiffInBST(TreeNode root) {
    if (root == null) return 0;
    this.dfs(root);

    return min;
  }
}

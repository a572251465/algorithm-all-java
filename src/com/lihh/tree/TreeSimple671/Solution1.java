package com.lihh.tree.TreeSimple671;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple671
 * @Author: lihh
 * @CreateTime: 2022-09-07  18:55
 * @Description: TODO
 */
public class Solution1 {
  int ans = -1;
  int initial = -1;

  public void dfs(TreeNode root) {
    if (root == null) return;

    if (ans != -1 && root.val >= ans) return;
    if (root.val > initial) ans = root.val;


    this.dfs(root.left);
    this.dfs(root.right);
  }

  public int findSecondMinimumValue(TreeNode root) {
    initial = root.val;
    this.dfs(root);

    return ans;
  }
}

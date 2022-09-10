package com.lihh.tree.TreeSimple938;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple938
 * @Author: lihh
 * @CreateTime: 2022-09-10  22:42
 * @Description: 938. 二叉搜索树的范围和
 */
public class Solution {
  int ans = 0;

  public void dfs(TreeNode r, int l, int h) {
    if (r == null) return;

    this.dfs(r.left, l, h);

    if (r.val >= l) {
      if (r.val <= h) {
        ans += r.val;
      } else return;
    }

    this.dfs(r.right, l, h);
  }

  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) return ans;

    this.dfs(root, low, high);
    return ans;
  }
}

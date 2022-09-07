package com.lihh.tree.TreeSimple700;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple700
 * @Author: lihh
 * @CreateTime: 2022-09-07  20:33
 * @Description: 700. 二叉搜索树中的搜索
 */
public class Solution {
  TreeNode ans = null;

  public void dfs(TreeNode r, int k) {
    if (r == null) return;

    if (r.val == k) {
      ans = r;
      return;
    }
    this.dfs(r.left, k);
    this.dfs(r.right, k);
  }

  public TreeNode searchBST(TreeNode root, int val) {
    this.dfs(root, val);
    return ans;
  }
}

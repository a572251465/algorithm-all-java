package com.lihh.tree.TreeSimple993;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple993
 * @Author: lihh
 * @CreateTime: 2022-09-12  22:09
 * @Description: 993. 二叉树的堂兄弟节点
 */
public class Solution {
  int xDepth = 0;
  int yDepth = 0;
  TreeNode xP = null;
  TreeNode yP = null;

  public void dfs(TreeNode r, int x, int y, int depth, TreeNode prev) {
    if (r == null) return;

    if (r.val == x) {
      xDepth = depth;
      xP = prev;
    }

    if (r.val == y) {
      yDepth = depth;
      yP = prev;
    }

    this.dfs(r.left, x, y, depth + 1, r);
    this.dfs(r.right, x, y, depth + 1, r);
  }

  public boolean isCousins(TreeNode root, int x, int y) {
    this.dfs(root, x, y, 0, null);
    return xDepth == yDepth && xP != yP;
  }
}

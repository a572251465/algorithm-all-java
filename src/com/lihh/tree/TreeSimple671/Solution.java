package com.lihh.tree.TreeSimple671;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple671
 * @Author: lihh
 * @CreateTime: 2022-09-07  18:29
 * @Description: 671. 二叉树中第二小的节点
 */
public class Solution {
  int res = -1;
  int initial = -1;

  public void dfs(TreeNode root, int k) {
    if (root == null) return;

    if (res == -1) {
      if (root.val > k) res = root.val;
    } else {
      if (root.val != initial && res > root.val) res = root.val;
    }
    this.dfs(root.left, k);
    this.dfs(root.right, k);
  }

  public int findSecondMinimumValue(TreeNode root) {
    initial = root.val;
    this.dfs(root, root.val);
    return res;
  }
}

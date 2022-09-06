package com.lihh.tree.TreeSimple543;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple543
 * @Author: lihh
 * @CreateTime: 2022-09-06  07:52
 * @Description: 二叉树的直径
 */
public class Solution {
  int max = Integer.MIN_VALUE;

  public int dfs(TreeNode root) {
    if (root == null) return 0;

    int leftTree = dfs(root.left);
    int rightTree = dfs(root.right);

    max = Math.max(max, leftTree + rightTree);

    return Math.max(leftTree, rightTree) + 1;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) return 0;

    this.dfs(root);

    return max;
  }
}

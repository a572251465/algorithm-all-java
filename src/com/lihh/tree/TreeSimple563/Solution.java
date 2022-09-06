package com.lihh.tree.TreeSimple563;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple563
 * @Author: lihh
 * @CreateTime: 2022-09-06  09:35
 * @Description: 563. 二叉树的坡度
 */
public class Solution {
  int sum = 0;

  public int dfs(TreeNode root) {
    if (root == null) return 0;

    int leftSum = this.dfs(root.left);
    int rightSum = this.dfs(root.right);

    sum += Math.abs(leftSum - rightSum);

    return leftSum + rightSum + root.val;
  }

  public int findTilt(TreeNode root) {
    this.dfs(root);

    return sum;
  }
}

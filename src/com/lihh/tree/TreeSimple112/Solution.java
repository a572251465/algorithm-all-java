package com.lihh.tree.TreeSimple112;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple112
 * @Author: lihh
 * @CreateTime: 2022-09-03  14:29
 * @Description: 112. 路径总和
 */
public class Solution {
  public boolean dfs(TreeNode root, int targetSum) {
    if (root == null) return false;
    if (root.left == null && root.right == null) {
      return targetSum == root.val;
    }

    boolean leftS = dfs(root.left, targetSum - root.val);
    boolean rightS = dfs(root.right, targetSum - root.val);

    return leftS || rightS;
  }
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    return dfs(root, targetSum);
  }
}

package com.lihh.tree.TreeSimple404;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple404
 * @Author: lihh
 * @CreateTime: 2022-09-04  21:47
 * @Description: 左叶子之和
 */
public class Solution {
  public boolean isSonTreeNull(TreeNode root) {
    return root.left == null && root.right == null;
  }

  public int sumOfLeftLeaves(TreeNode root) {
    int ans = 0;
    if (root == null) return 0;

    if (root.left != null && isSonTreeNull(root.left)) {
      ans += root.left.val;
    }

    ans += sumOfLeftLeaves(root.left);
    ans += sumOfLeftLeaves(root.right);

    return ans;
  }
}

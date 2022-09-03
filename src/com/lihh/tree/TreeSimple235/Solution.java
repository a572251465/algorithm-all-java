package com.lihh.tree.TreeSimple235;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple235
 * @Author: lihh
 * @CreateTime: 2022-09-04  00:41
 * @Description: 二叉搜索树的最近公共祖先
 */
public class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;

    int pVal = p.val, qVal = q.val;
    for (; root != null; ) {
      int val = root.val;
      if ((val - pVal) * (val - qVal) <= 0) return root;

      root = val - pVal > 0 ? root.left : root.right;
    }

    return null;
  }
}

package com.lihh.tree.TreeSimple617;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple617
 * @Author: lihh
 * @CreateTime: 2022-09-06  21:17
 * @Description: 617. 合并二叉树
 */
public class Solution {
  public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
    if (r1 == null && r2 == null) return null;

    int sum = (r1 != null ? r1.val : 0) + (r2 != null ? r2.val : 0);
    TreeNode root = new TreeNode(sum);

    root.left = mergeTrees(r1 != null ? r1.left : null, r2 != null ? r2.left : null);
    root.right = mergeTrees(r1 != null ? r1.right : null, r2 != null ? r2.right : null);

    return root;
  }
}

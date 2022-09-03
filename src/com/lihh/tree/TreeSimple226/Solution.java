package com.lihh.tree.TreeSimple226;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple226
 * @Author: lihh
 * @CreateTime: 2022-09-03  23:32
 * @Description: 反转二叉树
 */
public class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    TreeNode leftTree = root.left;
    root.left = root.right;
    root.right = leftTree;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }
}

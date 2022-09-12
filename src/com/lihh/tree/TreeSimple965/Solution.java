package com.lihh.tree.TreeSimple965;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple965
 * @Author: lihh
 * @CreateTime: 2022-09-12  22:03
 * @Description: 965. 单值二叉树
 */
public class Solution {
  public boolean isUnivalTree(TreeNode root) {
    if (root == null) return true;

    LinkedList<TreeNode> list = new LinkedList<>();
    list.add(root);
    int initialValue = root.val;

    for (; list.size() > 0; ) {
      TreeNode r = list.remove();
      if (r.val != initialValue) return false;

      if (r.left != null) list.add(r.left);
      if (r.right != null) list.add(r.right);
    }

    return true;
  }
}

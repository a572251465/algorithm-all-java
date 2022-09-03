package com.lihh.tree.TreeSimple226;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple226
 * @Author: lihh
 * @CreateTime: 2022-09-03  23:40
 * @Description: while
 */
public class Solution1 {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    LinkedList<TreeNode> stack = new LinkedList<>();

    stack.add(root);
    for (; stack.size() > 0; ) {
      TreeNode front = stack.removeFirst();

      TreeNode leftTree = front.left;
      front.left = front.right;
      front.right = leftTree;

      if (front.left != null) stack.add(front.left);
      if (front.right != null) stack.add(front.right);
    }

    return root;
  }
}

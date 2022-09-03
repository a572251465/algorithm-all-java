package com.lihh.tree.TreeSimple144;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple114
 * @Author: lihh
 * @CreateTime: 2022-09-03  18:02
 * @Description: 前序遍历
 */
public class Solution1 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();
    if (root == null) return list;

    TreeNode front = root;
    LinkedList<TreeNode> stack = new LinkedList<>();

    while (stack.size() > 0 || front != null) {
      if (front != null) {
        list.add(front.val);
        stack.add(front);
        front = front.left;
      } else {
        TreeNode item = stack.removeLast();
        front = item.right;
      }
    }

    return list;
  }
}

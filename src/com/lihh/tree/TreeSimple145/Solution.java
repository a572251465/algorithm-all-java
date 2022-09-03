package com.lihh.tree.TreeSimple145;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple145
 * @Author: lihh
 * @CreateTime: 2022-09-03  23:23
 * @Description: 二叉树的后序遍历
 */
public class Solution {
  public void dfs(TreeNode root, List<Integer> list) {
    if (root == null) return;

    dfs(root.left, list);
    dfs(root.right, list);

    list.add(root.val);
  }
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();

    if (root == null) return list;
    dfs(root, list);
    return list;
  }
}

package com.lihh.tree.TreeSimple114;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple114
 * @Author: lihh
 * @CreateTime: 2022-09-03  17:57
 * @Description: 前序遍历
 */
public class Solution {

  public void dfs(TreeNode root, List<Integer> list) {
    if (root == null) return;

    list.add(root.val);
    dfs(root.left, list);
    dfs(root.right, list);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();
    if (root == null) return list;

    this.dfs(root, list);

    return list;
  }
}

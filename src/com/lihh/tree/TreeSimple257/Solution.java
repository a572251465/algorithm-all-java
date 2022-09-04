package com.lihh.tree.TreeSimple257;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple257
 * @Author: lihh
 * @CreateTime: 2022-09-04  09:59
 * @Description: 二叉树的所有路径
 */
public class Solution {
  public void dfs(TreeNode root, String str, List<String> list) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
      str += root.val;
      list.add(str);
      return;
    }

    dfs(root.left, str + root.val + "->", list);
    dfs(root.right, str + root.val + "->", list);
  }
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> list = new ArrayList<>();
    if (root == null) return list;

    this.dfs(root, "", list);
    return list;
  }
}

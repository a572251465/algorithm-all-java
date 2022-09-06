package com.lihh.tree.TreeSimple606;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple606
 * @Author: lihh
 * @CreateTime: 2022-09-06  16:59
 * @Description: TODO
 */
public class Solution1 {
  String str = "";

  public void dfs(TreeNode root) {
    if (root == null) return;

    str = str + "(" + root.val;
    this.dfs(root.left);

    if (root.left == null && root.right != null) {
      str += "()";
    }

    this.dfs(root.right);
    str += ")";
  }

  public String tree2str(TreeNode root) {
    if (root == null) return "";
    this.dfs(root);

    return str.substring(1, str.length() - 1);
  }
}

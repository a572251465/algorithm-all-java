package com.lihh.tree.TreeSimple606;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple606
 * @Author: lihh
 * @CreateTime: 2022-09-06  16:15
 * @Description: 606. 根据二叉树创建字符串
 */
public class Solution {

  public String dfs(TreeNode root) {
    if (root == null) return "";

    String str = root.val + "";

    String l = this.dfs(root.left);
    String r = this.dfs(root.right);

    if (l == "" && r == "") return "(" + str + ")";
    str = "(" + str + (l == "" ? "()" : l)  + r + ")";
    return str;
  }

  public String tree2str(TreeNode root) {
    if (root == null) return "";
    if (root.left == null && root.right == null) return new Integer(root.val).toString();
    String str = this.dfs(root);
    return str.substring(1, str.length() - 1);
  }
}

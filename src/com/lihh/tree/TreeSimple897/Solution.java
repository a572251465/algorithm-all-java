package com.lihh.tree.TreeSimple897;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple897
 * @Author: lihh
 * @CreateTime: 2022-09-10  22:34
 * @Description: 897. 递增顺序搜索树
 */
public class Solution {
  TreeNode ans = new TreeNode(-1);
  TreeNode res = ans;

  public void dfs(TreeNode r) {
    if (r == null) return;

    this.dfs(r.left);

    res.right = new TreeNode(r.val);
    res = res.right;

    this.dfs(r.right);
  }

  public TreeNode increasingBST(TreeNode root) {
    if (root == null) return ans.right;

    this.dfs(root);
    return ans.right;
  }
}

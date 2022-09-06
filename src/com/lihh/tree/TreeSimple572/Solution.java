package com.lihh.tree.TreeSimple572;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple572
 * @Author: lihh
 * @CreateTime: 2022-09-06  09:46
 * @Description: 572. 另一棵树的子树
 */
public class Solution {
  public boolean isSameTree(TreeNode r, TreeNode s) {
    if (r == null && s == null) return true;
    if (r == null || s == null) return false;
    if (r.val != s.val) return false;

    return isSameTree(r.left, s.left) && isSameTree(r.right, s.right);
  }
  public boolean isSubtree(TreeNode r, TreeNode s) {
    if (r == null) return false;
    return isSameTree(r, s) || isSubtree(r.left, s) || isSubtree(r.right, s);
  }
}

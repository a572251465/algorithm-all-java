package com.lihh.tree.TreeSimple653;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple653
 * @Author: lihh
 * @CreateTime: 2022-09-07  05:50
 * @Description: 653. 两数之和 IV - 输入二叉搜索树
 */
public class Solution {
  boolean exist = false;
  Set<Integer> set = new LinkedHashSet<>();

  public void dfs(TreeNode r, int k) {
    if (r == null) return;

    this.dfs(r.left, k);

    int val = r.val;
    if (set.contains(val)) {
      exist = true;
      return;
    } else {
      set.add(k - val);
    }

    this.dfs(r.right, k);
  }

  public boolean findTarget(TreeNode root, int k) {
    this.dfs(root, k);
    return exist;
  }
}

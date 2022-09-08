package com.lihh.tree.TreeSimple872;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple872
 * @Author: lihh
 * @CreateTime: 2022-09-08  20:57
 * @Description: TODO
 */
public class Solution {
  List<Integer> lRes = new ArrayList<>();
  List<Integer> rRes = new ArrayList<>();

  public void dfs(TreeNode r, List<Integer> s) {
    if (r == null) return;

    if (r.left == null && null == r.right) {
      s.add(r.val);
      return;
    }
    this.dfs(r.left, s);
    this.dfs(r.right, s);
  }

  public boolean leafSimilar(TreeNode r1, TreeNode r2) {
    if (r1 == null && r2 == null) return true;
    if (r1 == null || r2 == null) return false;

    this.dfs(r1, lRes);
    this.dfs(r2, rRes);

    return lRes.toString().equals(rRes.toString());
  }
}

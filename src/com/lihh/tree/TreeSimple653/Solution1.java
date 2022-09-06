package com.lihh.tree.TreeSimple653;

import com.lihh.common.structure.TreeNode;

import java.util.LinkedList;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple653
 * @Author: lihh
 * @CreateTime: 2022-09-07  05:57
 * @Description: TODO
 */
public class Solution1 {
  LinkedList<Integer> res = new LinkedList<>();

  public void dfs(TreeNode r) {
    if (r == null) return;

    dfs(r.left);
    res.add(r.val);
    dfs(r.right);
  }

  public boolean findTarget(TreeNode root, int k) {
    this.dfs(root);

    int start = 0, end = res.size() - 1;
    for (; start < end;) {
      int s = res.get(start) + res.get(end);

      if (s == k) return true;

      if (s < k) {
        start++;
      } else {
        end--;
      }
    }

    return false;
  }
}

package com.lihh.tree.TreeSimple501;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple501
 * @Author: lihh
 * @CreateTime: 2022-09-04  22:16
 * @Description: 二叉搜索树中的众数
 */
public class Solution {
  List<Integer> ans = new ArrayList<>();
  int base, maxCount, count;

  public void dfs(TreeNode root) {
    if (root == null) return;

    dfs(root.left);
    this.updateCurrValue(root.val);
    dfs(root.right);
  }

  public void updateCurrValue(int val) {
    if (base == val) {
      count += 1;
    } else {
      base = val;
      count = 1;
    }

    if (count == maxCount) {
      ans.add(val);
    }

    if (count > maxCount) {
      maxCount = count;
      ans.clear();
      ans.add(val);
    }
  }

  public int[] findMode(TreeNode root) {
    this.dfs(root);
    int[] mode = new int[ans.size()];
    for (int i = 0; i < mode.length; i += 1) {
      mode[i] = ans.get(i);
    }

    return mode;
  }
}

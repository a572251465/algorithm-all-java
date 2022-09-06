package com.lihh.tree.TreeSimple637;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple637
 * @Author: lihh
 * @CreateTime: 2022-09-06  23:39
 * @Description: 637. 二叉树的层平均值
 */
public class Solution {
  List<Double> res = new ArrayList<>();

  public void dfs(LinkedList<TreeNode> list) {
    if (list.size() <= 0) return;

    int len = list.size();
    Double sum = 0d;
    TreeNode curr = null;
    LinkedList<TreeNode> newList = new LinkedList<>();
    for (; (curr = list.poll()) != null; ) {
      sum += curr.val;
      if (curr.left != null) newList.offer(curr.left);
      if (curr.right != null) newList.offer(curr.right);
    }

    res.add((sum / len));
    this.dfs(newList);
  }

  public List<Double> averageOfLevels(TreeNode root) {
    LinkedList<TreeNode> list = new LinkedList<>();
    list.add(root);
    this.dfs(list);

    return res;
  }
}

package com.lihh.tree.TreeSimple94;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void dfs(TreeNode root, List<Integer> res) {
        if (root == null) return;

        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        this.dfs(root, res);
        return res;
    }
}

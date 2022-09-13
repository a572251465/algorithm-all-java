package com.lihh.tree.TreeSimple1022;

import com.lihh.common.structure.TreeNode;

public class Solution {

    public int dfs(TreeNode r, int val) {
        if (r == null) return 0;

        val = (val << 1) | r.val;
        if (r.left == null && r.right == null) {
            return val;
        }

        return this.dfs(r.left, val) + this.dfs(r.right, val);
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;

        return this.dfs(root, 0);
    }
}

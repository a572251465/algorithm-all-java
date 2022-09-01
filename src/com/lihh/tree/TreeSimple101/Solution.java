package com.lihh.tree.TreeSimple101;

import com.lihh.common.structure.TreeNode;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple101
 * @Author: lihh
 * @CreateTime: 2022-09-01  22:44
 * @Description: 对称二叉树
 */
public class Solution {
    public boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
}

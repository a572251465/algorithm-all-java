package com.lihh.common.structure;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.common.structure
 * @Author: lihh
 * @CreateTime: 2022-09-01  16:25
 * @Description: 树结构
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

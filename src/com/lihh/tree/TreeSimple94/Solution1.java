package com.lihh.tree.TreeSimple94;

import com.lihh.common.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: algorithm-all-java
 * @BelongsPackage: com.lihh.tree.TreeSimple94
 * @Author: lihh
 * @CreateTime: 2022-09-01  19:21
 * @Description: 通过循环的形式 来进行中序遍历
 */
public class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode front = root;

        while (stack.size() > 0 || front != null) {

            if (front != null) {
                stack.add(front);
                front = front.left;
            } else {
                front = stack.removeLast();
                res.add(front.val);
                front = front.right;
            }
        }

        return res;
    }
}

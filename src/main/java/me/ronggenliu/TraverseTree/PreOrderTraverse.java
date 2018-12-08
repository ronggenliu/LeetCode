package me.ronggenliu.TraverseTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 */
class PreOrderTraverse {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> rights = new Stack<>();
        while(null != root) {
            list.add(root.val);
            if(null != root.right) {
                rights.push(root.right);
            }
            root = root.left;
            if(root == null && !rights.isEmpty()) {
                root = rights.pop();
            }
        }
        return list;
    }
}
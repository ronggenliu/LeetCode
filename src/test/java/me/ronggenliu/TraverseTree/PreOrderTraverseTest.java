package me.ronggenliu.TraverseTree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PreOrderTraverseTest {

    @Test
    public void preorderTraversal() {
        TreeNode root = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(5);
        TreeNode left12 = new TreeNode(9);
        root.left = left1;
        root.right = right1;
        left1.left = left12;

        PreOrderTraverse preOrderTraverse = new PreOrderTraverse();
        List<Integer> result = Arrays.asList(2, 3, 9, 5);
        assertEquals(result, preOrderTraverse.preorderTraversal(root));
    }
}
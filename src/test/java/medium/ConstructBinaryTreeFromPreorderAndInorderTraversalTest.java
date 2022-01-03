package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void test1() {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        assertEquals(3, constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder).val);
    }

    @Test
    void test2() {
        int[] preorder = new int[]{1,2};
        int[] inorder = new int[]{2,1};
        assertEquals(1, constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder).val);
    }

    @Test
    void test3() {
        int[] preorder = new int[]{1,2,3};
        int[] inorder = new int[]{3,2,1};
        assertEquals(1, constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder).val);
    }

}
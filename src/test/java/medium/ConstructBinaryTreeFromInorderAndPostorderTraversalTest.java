package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
    ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void test1() {
        int[] inorder = new int[] {9,3,15,20,7};
        int[] postorder = new int[] {9,15,7,20,3};
        assertEquals(3, constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder).val);
    }

}
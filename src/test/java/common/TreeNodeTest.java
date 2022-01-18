package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {


    @Test
    void serializationTest1() {
        TreeNode root = new TreeNode(new Integer[]{1,2,3,null,null,4,5});
        assertEquals("1,2,3,null,null,4,5", root.serialize(root));
    }

    @Test
    void serializationTest2() {
        TreeNode root = new TreeNode(new Integer[]{1});
        assertEquals("1", root.serialize(root));
    }

    @Test
    void serializationTest3() {
        TreeNode root = new TreeNode(new Integer[]{1,null,2,null,null,3,4});
        assertEquals("1,null,2,3,4", root.serialize(root));
    }


    @Test
    void deserializationTest1() {
        TreeNode root = TreeNode.deserialize("1,2,3,null,null,4,5");
        assertEquals(1, root.val);
    }

    @Test
    void deserializationTest2() {
        TreeNode root = TreeNode.deserialize("1");
        assertNotNull(root);
    }

    @Test
    void deserializationTest3() {
        TreeNode root = TreeNode.deserialize("1,null,2,3,4");
        assertEquals(new TreeNode(new Integer[]{1,null,2,null,null,3,4}), root);
    }

}
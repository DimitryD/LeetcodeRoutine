package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinarySearchTreesTest {
    UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();

    @Test
    void test1() {
        assertEquals(1, uniqueBinarySearchTrees.numTrees(1));
    }

    @Test
    void test2() {
        assertEquals(2, uniqueBinarySearchTrees.numTrees(2));
    }

    @Test
    void test3() {
        assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
    }

    @Test
    void test4() {
        assertEquals(14, uniqueBinarySearchTrees.numTrees(4));
    }

    @Test
    void test5() {
        assertEquals(1767263190, uniqueBinarySearchTrees.numTrees(19));
    }

}
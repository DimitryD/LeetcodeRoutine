package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();

    @Test
    void test1() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }

    @Test
    void test2() {
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }

    @Test
    void test3() {
        assertEquals(6, uniquePaths.uniquePaths(3, 3));
    }

}
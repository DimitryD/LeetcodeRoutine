package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    SimplifyPath simplifyPath = new SimplifyPath();

    @Test
    void test1() {
        assertEquals("/home", simplifyPath.simplifyPath("/home/"));
    }

    @Test
    void test2() {
        assertEquals("/", simplifyPath.simplifyPath("/../"));
    }

    @Test
    void test3() {
        assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
    }

    @Test
    void test4() {
        assertEquals("/b", simplifyPath.simplifyPath("/a/../b"));
    }

    @Test
    void test5() {
        assertEquals("/c", simplifyPath.simplifyPath("/a/./b/../../c/"));
    }

}
package interview.google;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseVersionsTest {

    @Test
    void test1() {
        String[] versions = new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        String[] sortedVersions = new String[]{"0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0"};
        assertArrayEquals(sortedVersions, ReleaseVersions.solution(versions));
    }

    @Test
    void test2() {
        String[] versions = new String[]{"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        String[] sortedVersions = new String[]{"1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"};
        assertArrayEquals(sortedVersions, ReleaseVersions.solution(versions));
    }

    @Test
    void test3() {
        String[] versions = new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0", "3"};
        String[] sortedVersions = new String[]{"0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0", "3"};
        assertArrayEquals(sortedVersions, ReleaseVersions.solution(versions));
    }

    @Test
    void test4() {
        String[] versions = new String[]{"3"};
        String[] sortedVersions = new String[]{"3"};
        assertArrayEquals(sortedVersions, ReleaseVersions.solution(versions));
    }


}
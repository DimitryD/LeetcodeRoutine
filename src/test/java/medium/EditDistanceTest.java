package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    EditDistance editDistance = new EditDistance();


    @Test
    void test1() {
        assertEquals(0, editDistance.minDistance("", ""));
    }

    @Test
    void test2() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
    }

    @Test
    void test3() {
        assertEquals(5, editDistance.minDistance("intention", "execution"));
    }

}
package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {
    NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

    @Test
    void test1() {
        int[][] connections = new int[][] {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        assertEquals(2, numberOfProvinces.findCircleNum(connections));
    }

    @Test
    void test2() {
        int[][] connections = new int[][] {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        assertEquals(3, numberOfProvinces.findCircleNum(connections));
    }

}
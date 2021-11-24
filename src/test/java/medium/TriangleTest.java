package medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    void test1() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(-10);
        triangle.add(firstRow);
        assertEquals(-10, this.triangle.minimumTotal(triangle));
    }

    @Test
    void test2() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(2);
        triangle.add(firstRow);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(3);
        secondRow.add(4);
        triangle.add(secondRow);
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(5);
        thirdRow.add(6);
        thirdRow.add(7);
        triangle.add(thirdRow);
        List<Integer> fourthRow = new ArrayList<>();
        fourthRow.add(4);
        fourthRow.add(1);
        fourthRow.add(8);
        fourthRow.add(3);
        triangle.add(fourthRow);
        assertEquals(11, this.triangle.minimumTotal(triangle));
    }

}
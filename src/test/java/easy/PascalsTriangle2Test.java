package easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangle2Test {
    PascalsTriangle2 pascalsTriangle2 = new PascalsTriangle2();

    @Test
    void test1() {
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        assertIterableEquals(firstRow, pascalsTriangle2.getRow(0));
    }

    @Test
    void test2() {
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        assertIterableEquals(secondRow, pascalsTriangle2.getRow(1));
    }

    @Test
    void test3() {
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(1);
        thirdRow.add(2);
        thirdRow.add(1);
        assertIterableEquals(thirdRow, pascalsTriangle2.getRow(2));
    }


    @Test
    void test4() {
        List<Integer> fourthRow = new ArrayList<>();
        fourthRow.add(1);
        fourthRow.add(3);
        fourthRow.add(3);
        fourthRow.add(1);
        assertIterableEquals(fourthRow, pascalsTriangle2.getRow(3));
    }

}
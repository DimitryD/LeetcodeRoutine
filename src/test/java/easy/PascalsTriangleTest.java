package easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    PascalsTriangle pascalsTriangle = new PascalsTriangle();


    @Test
    void test1() {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);
        assertIterableEquals(answer, pascalsTriangle.generate(1));
    }

    @Test
    void test2() {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        answer.add(secondRow);
        assertIterableEquals(answer, pascalsTriangle.generate(2));
    }

    @Test
    void test3() {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        answer.add(secondRow);
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(1);
        thirdRow.add(2);
        thirdRow.add(1);
        answer.add(thirdRow);
        assertIterableEquals(answer, pascalsTriangle.generate(3));
    }

}
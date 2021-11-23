package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    // https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);
        if (numRows == 1) return answer;
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        answer.add(secondRow);
        if (numRows == 2) return answer;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> prevRow = answer.get(i - 2);
            List<Integer> nthRow = new ArrayList<>();
            nthRow.add(1);
            for (int j = 1; j < i - 1; j++) {
                nthRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            nthRow.add(1);
            answer.add(nthRow);
        }

        return answer;
    }
}

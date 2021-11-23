package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    // https://leetcode.com/problems/pascals-triangle-ii/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        if (rowIndex == 0) return prevRow;
        prevRow.add(1);
        if (rowIndex == 1) return prevRow;
        List<Integer> currentRow = null;
        for (int i = 2; i <= rowIndex; i++) {
            currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j <= i - 1; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            prevRow = currentRow;
        }

        return currentRow;
    }
}

package medium;

import java.util.*;

//
// 1
// 1 | 2 3 5
// 2 | 4 6 10 -> 3 4 5
// 3 | 6 9 15 - > 4 5 6
// 4 | 8 12 20 -> 5 6 8
// 5 | 10 15 25 -> 6 8 10
//

public class UglyNumber2 {
    // https://leetcode.com/problems/ugly-number-ii/
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglies = new TreeSet<>();
        uglies.add(1L);
        long number = 0;
        for (int i = 0; i < n; i++) {
            number = uglies.pollFirst();
            uglies.add(number * 2);
            uglies.add(number * 3);
            uglies.add(number * 5);
        }
        return (int) number;
    }
}

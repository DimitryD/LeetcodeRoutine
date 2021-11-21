package medium;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DecodeWays {
    // https://leetcode.com/problems/decode-ways/

    public int numDecodings(String s) {
        int prev2 = 1;
        int prev1 = s.charAt(0) == '0' ? 0 : 1;
        int curr = prev1;
        for (int i = 2; i <= s.length(); i++) {
            curr = 0;
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first <= 9)
                curr += prev1;
            if (second >= 10 && second <= 26)
                curr += prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}

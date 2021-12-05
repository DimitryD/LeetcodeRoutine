package easy;

public class IsSubsequence {
    // https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        char[] subsequence = s.toCharArray();
        char[] text = t.toCharArray();
        int pointer = 0;
        for (char c : text)
            if (pointer < subsequence.length && c == subsequence[pointer])
                pointer++;

        return pointer == subsequence.length;
    }
}

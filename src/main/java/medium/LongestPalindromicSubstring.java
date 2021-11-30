package medium;

public class LongestPalindromicSubstring {
    // https://leetcode.com/problems/longest-palindromic-substring/
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 1) return "";
        int length = 1;
        String answer = s.substring(0, 1);
        for (int i = 0; i < n - 1; i++) {
            int curLength;
            if (s.charAt(i) == s.charAt(i + 1)) {
                curLength = 2;
                for (int j = 1; i - j >= 0 && i + j + 1 < n; j++) {
                    if (s.charAt(i - j) == s.charAt(i + j + 1))
                        curLength += 2;
                    else break;
                }
                if (curLength > length) {
                    answer = s.substring(i - curLength / 2 + 1, i + curLength / 2 + 1);
                    length = curLength;
                }

            }
            curLength = 1;
            for (int j = 1; i - j >= 0 && i + j < n; j++) {
                if (s.charAt(i - j) == s.charAt(i + j))
                    curLength += 2;
                else break;
            }
            if (curLength > length) {
                answer = s.substring(i - curLength / 2, i + curLength / 2 + 1);
                length = curLength;
            }

        }

        return answer;
    }
}

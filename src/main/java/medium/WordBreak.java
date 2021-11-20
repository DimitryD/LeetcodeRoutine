package medium;

import java.util.List;

public class WordBreak {
    // https://leetcode.com/problems/word-break/
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++)
            for (String word: wordDict)
                if (i >= word.length())
                    if (dp[i - word.length()])
                        if (s.startsWith(word, i - word.length())) {
                            dp[i] = true;
                            break;
                        }

        return dp[s.length()];
    }
}

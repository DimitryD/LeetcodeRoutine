package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> grouping = new HashMap<>();

        for (String word: words) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = String.valueOf(wordChars);
            if (!grouping.containsKey(sortedWord))
                grouping.put(sortedWord, new ArrayList<>());
            grouping.get(sortedWord).add(word);
        }

        return new ArrayList<>(grouping.values());
    }
}

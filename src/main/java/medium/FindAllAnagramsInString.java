package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInString {
    // https://leetcode.com/problems/find-all-anagrams-in-a-string/
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramsStartIndexes = new ArrayList<>();
        HashMap<Character, Integer> phrase = new HashMap<>();
        for (char c: p.toCharArray()) {
            if (phrase.containsKey(c)) phrase.put(c, phrase.get(c) + 1);
            else phrase.put(c, 0);
        }
        boolean anagram = false;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (anagram) {
                if (s.charAt(i + p.length() - 1) == s.charAt(i - 1)) {
                    anagramsStartIndexes.add(i);
                    continue;
                }
                anagram = false;
            }
            HashMap<Character, Integer> localPhrase = new HashMap<>(phrase);
            for (int j = i; j < i + p.length(); j++) {
                if (localPhrase.get(s.charAt(j)) != null) {
                    if (localPhrase.get(s.charAt(j)) > 0) localPhrase.put(s.charAt(j), localPhrase.get(s.charAt(j)) - 1);
                    else localPhrase.remove(s.charAt(j));
                } else if (phrase.get(s.charAt(j)) == null) {
                    // because there is a character in "window" which is not in the p, so we can start again from character after this one
                    i = j;
                    break;
                }
            }
            if (localPhrase.isEmpty())  {
                anagramsStartIndexes.add(i);
                anagram = true;
            }
        }
        return anagramsStartIndexes;
    }
}

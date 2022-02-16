package interview.google;

import java.util.HashMap;
import java.util.Map;


public class BrailleCodes {
    private static Map<Character, String> alphabet;
    public static String solution(String s) {
        // Set up alphabet
        if (alphabet == null) setUpAlphabet();
        StringBuilder encodedString = new StringBuilder();
        for (char c: s.toCharArray())
            // if capital letter faced (based on ASCI   I)
            if (c >= 65  && c <= 90) {
                // '!' means Braille capitalization mark
                encodedString.append(alphabet.get('!'));
                // based on ASCII table
                c += 32;
                encodedString.append(alphabet.get(c));
            } else encodedString.append(alphabet.get(c));
        return encodedString.toString();
    }

    private static void setUpAlphabet() {
        alphabet = new HashMap<>();
        alphabet.put('a', "100000");
        alphabet.put('b', "110000");
        alphabet.put('c', "100100");
        alphabet.put('d', "100110");
        alphabet.put('e', "100010");
        alphabet.put('f', "110100");
        alphabet.put('g', "110110");
        alphabet.put('h', "110010");
        alphabet.put('i', "010100");
        alphabet.put('j', "010110");
        alphabet.put('k', "101000");
        alphabet.put('l', "111000");
        alphabet.put('m', "101100");
        alphabet.put('n', "101110");
        alphabet.put('o', "101010");
        alphabet.put('p', "111100");
        alphabet.put('q', "111110");
        alphabet.put('r', "111010");
        alphabet.put('s', "011100");
        alphabet.put('t', "011110");
        alphabet.put('u', "101001");
        alphabet.put('v', "111001");
        alphabet.put('w', "010111");
        alphabet.put('x', "101101");
        alphabet.put('y', "101111");
        alphabet.put('z', "101011");
        alphabet.put(' ', "000000");
        alphabet.put('!', "000001");
    }
}

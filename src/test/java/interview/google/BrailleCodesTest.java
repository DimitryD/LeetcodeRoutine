package interview.google;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrailleCodesTest {

    @Test
    void test1() {
        assertEquals("100100101010100110100010", BrailleCodes.solution("code"));
    }

    @Test
    void test2() {
        assertEquals("000001110000111010100000010100111000111000100010", BrailleCodes.solution("Braille"));
    }

    @Test
    void test3() {
        assertEquals("000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110",
                BrailleCodes.solution("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void test4() {
        assertEquals("000001011110110010100010",
                BrailleCodes.solution("The"));
    }

    @Test
    void test5() {
        assertEquals("110010",
                BrailleCodes.solution("h"));
    }

}
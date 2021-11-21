package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {
    DecodeWays decodeWays = new DecodeWays();

    @Test
    void test1() {
        String text = "12";
        assertEquals(2, decodeWays.numDecodings(text));
    }

    @Test
    void test2() {
        String text = "226";
        assertEquals(3, decodeWays.numDecodings(text));
    }

    @Test
    void test3() {
        String text = "06";
        assertEquals(0, decodeWays.numDecodings(text));
    }

    @Test
    void test4() {
        String text = "11106";
        assertEquals(2, decodeWays.numDecodings(text));
    }

    @Test
    void test5() {
        String text = "262626";
        assertEquals(8, decodeWays.numDecodings(text));
    }


}
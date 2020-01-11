import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void test_reverseString_with_spaces() {
        assertEquals("KK si eman yM",ReverseString.reverseString("My name is KK"));
    }

    @Test
    void test_reverseString_empty_string() {
        assertEquals("",ReverseString.reverseString(""));
    }

    @Test
    void test_reverseString_special_char() {
        assertEquals("D % C ^ B * A",ReverseString.reverseString("A * B ^ C % D"));
    }

    @Test
    void test_reverseString_null_string() {
        assertEquals(null,ReverseString.reverseString(null));
    }
}
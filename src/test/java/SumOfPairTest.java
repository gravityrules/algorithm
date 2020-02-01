import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPairTest {

    @Test
    void test_findSumOfPair_Number_Missing() {
        assertFalse(SumOfPair.findSumOfPair(Arrays.asList(1, 5, 7, 3, 9), 20));
    }

    @Test
    void test_findSumOfPair_Number_Present() {
        assertTrue(SumOfPair.findSumOfPair(Arrays.asList(1, 5, 7, 3, 9), 8));
        assertTrue(SumOfPair.findSumOfPair(Arrays.asList(1, 2, 4, 4), 8));
    }

    @Test
    void test_findSumOfPair_EmptyList() {
        assertFalse(SumOfPair.findSumOfPair(Collections.<Integer>emptyList(), 10));
    }
}
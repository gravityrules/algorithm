import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void test_mergeSortedList_two_diff_lists() {
        assertEquals(Arrays.asList(1,4,5,8,9,10),
                MergeSortedArray.mergeSortedList(Arrays.asList(1,8,9),Arrays.asList(4,5,10)));

    }

    @Test
    void test_mergeSortedList_two_same_lists() {
        assertEquals(Arrays.asList(1,1,2,2,3,3),
                MergeSortedArray.mergeSortedList(Arrays.asList(1,2,3),Arrays.asList(1,2,3)));

    }

    @Test
    void test_mergeSortedList_two_empty_lists() {
        assertEquals(Collections.emptyList(),
                MergeSortedArray.mergeSortedList(Collections.<Integer>emptyList(),Collections.<Integer>emptyList()));

    }

    @Test
    void test_mergeSortedList_one_empty_lists() {
        assertEquals(Arrays.asList(1,8,9,10),
                MergeSortedArray.mergeSortedList(Arrays.asList(1,8,9,10),Collections.<Integer>emptyList()));

    }
}
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test_searchLoop_key_present_best_case() {
        List<Integer> list = Arrays.asList(1,4,7,9,10,15,17);
        int index = BinarySearch.searchLoop(list,9);
        assertEquals(3,index);
    }


    @Test
    void test_searchLoop_key_present_list_even() {
        List<Integer> list = Arrays.asList(1,4,7,9,10,15);
        int index = BinarySearch.searchLoop(list,15);
        assertEquals(5,index);
    }

    @Test
    void test_searchLoop_key_missing_list_even() {
        List<Integer> list = Arrays.asList(1,4,7,9,10,15);
        int index = BinarySearch.searchLoop(list,11);
        assertEquals(-1, index);
    }

    @Test
    void test_searchLoop_key_present_list_odd() {
        List<Integer> list = Arrays.asList(1,4,7,9,10,15,20);
        int index = BinarySearch.searchLoop(list,20);
        assertEquals(6,index);
    }

    @Test
    void test_searchLoop_key_missing_list_odd() {
        List<Integer> list = Arrays.asList(1,4,7,9,10,15,20);
        int index = BinarySearch.searchLoop(list,0);
        assertEquals(-1,index);
    }

}
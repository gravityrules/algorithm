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

    @Test
    void test_searchNextLargest_key_present_at_end(){
        List<Integer> list = Arrays.asList(1,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,20);
        assertEquals(-1,index);
    }


    @Test
    void test_searchNextLargest_key_present_at_start(){
        List<Integer> list = Arrays.asList(3,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,3);
        assertEquals(1,index);
        assertEquals(4,list.get(index));
    }

    @Test
    void test_searchNextLargest_key_missing_next_largest_exist(){
        List<Integer> list = Arrays.asList(3,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,1);
        assertEquals(0,index);
        assertEquals(3,list.get(index));
    }

    @Test
    void test_searchNextLargest_key_missing_LHS_range_next_largest_exist(){
        List<Integer> list = Arrays.asList(3,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,6);
        assertEquals(2,index);
        assertEquals(7,list.get(index));
    }


    @Test
    void test_searchNextLargest_key_missing_RHS_range_next_largest_exist(){
        List<Integer> list = Arrays.asList(3,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,16);
        assertEquals(6,index);
        assertEquals(20,list.get(index));
    }

    @Test
    void test_searchNextLargest_key_missing_next_largest_doesnt_exist(){
        List<Integer> list = Arrays.asList(3,4,7,9,10,15,20);
        int index = BinarySearch.searchNextLargest(list,25);
        assertEquals(-1,index);
    }

}
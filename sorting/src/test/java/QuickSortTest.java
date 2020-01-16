import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void test_sort_mixed() {
        List<Integer> list = Arrays.asList(3,7,8,5,2,1,9,4);
        QuickSort.sort(list);
        assertEquals(Arrays.asList(1,2,3,4,5,7,8,9),list);
    }

    @Test
    void test_sort_sorted() {
        List<Integer> list = Arrays.asList(10,20,30,31,41,50);
        QuickSort.sort(list);
        assertEquals(Arrays.asList(10,20,30,31,41,50),list);
    }

    @Test
    void test_sort_reverse() {
        List<Integer> list = Arrays.asList(23,14,9,5,2,0);
        QuickSort.sort(list);
        assertEquals(Arrays.asList(0,2,5,9,14,23),list);
    }

    @Test
    void test_sort_empty() {
        List<Integer> list = Collections.emptyList();
        QuickSort.sort(list);
        assertEquals(Collections.emptyList(),list);
    }

    @Test
    void test_sort_only_one() {
        List<Integer> list = Collections.singletonList(9);
        QuickSort.sort(list);
        assertEquals(Collections.singletonList(9),list);
    }

    @Test
    void test_sort_only_two_reverse() {
        List<Integer> list = Arrays.asList(10,9);
        QuickSort.sort(list);
        assertEquals(Arrays.asList(9,10),list);
    }

    @Test
    void test_sort_only_two_sorted() {
        List<Integer> list = Arrays.asList(9,10);
        QuickSort.sort(list);
        assertEquals(Arrays.asList(9,10),list);
    }

    @Test
    void test_partition_mixed() {
        List<Integer> list = Arrays.asList(3,7,8,5,2,1,9,4);
        int pivot = QuickSort.partition(list);
        assertEquals(3,pivot);
        assertEquals(Arrays.asList(3,1,2,4,5,8,9,7),list);
    }

    @Test
    void test_partition_sorted() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        int pivot = QuickSort.partition(list);
        assertEquals(7,pivot);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8),list);
    }

    @Test
    void test_partition_reverse_sorted() {
        List<Integer> list = Arrays.asList(20,18,9,5,2,1);
        int pivot = QuickSort.partition(list);
        assertEquals(0,pivot);
        assertEquals(Arrays.asList(1,18,9,5,2,20),list);
    }

    @Test
    void test_partition_empty() {
        List<Integer> list = Collections.emptyList();
        int pivot = QuickSort.partition(list);
        assertEquals(-1,pivot);
        assertEquals(Collections.emptyList(),list);
    }
}
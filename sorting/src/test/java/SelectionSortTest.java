import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void test_sort_dataSet1() {
        List<Integer> list = Arrays.asList(11, 25, 12, 22, 64);
        SelectionSort.sort(list);
        assertEquals(Arrays.asList(11,12,22,25,64),list);
    }

    @Test
    void test_sort_emptyList(){
        List<Integer> integerList = Collections.emptyList();
        SelectionSort.sort(integerList);
        assertEquals(Collections.emptyList(),integerList);
    }

    @Test
    void test_sort_sortedList(){
        List<Integer> integerList = Arrays.asList(1,2,5,7,10);
        SelectionSort.sort(integerList);
        assertEquals(Arrays.asList(1,2,5,7,10),integerList);
    }

    @Test
    void test_sort_reverseList(){
        List<Integer> integerList = Arrays.asList(20,10,5,4,3,-1);
        SelectionSort.sort(integerList);
        assertEquals(Arrays.asList(-1,3,4,5,10,20),integerList);
    }
}
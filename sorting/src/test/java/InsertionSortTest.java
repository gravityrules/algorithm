import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void test_Sort_Basic_Case(){
        List<Integer> list = Arrays.asList(10,6,4,20);
        InsertionSort.sort(list);
        assertEquals(Arrays.asList(4,6,10,20),list);
    }


    @Test
    void test_Sort_Empty_Case(){
        List<Integer> list = Collections.emptyList();
        InsertionSort.sort(list);
        assertEquals(Collections.emptyList(),list);
    }

    @Test
    void test_Sort_Reverse_Case(){
        List<Integer> list = Arrays.asList(10,5,4,3,2,-1);
        InsertionSort.sort(list);
        assertEquals(Arrays.asList(-1,2,3,4,5,10),list);
    }

    @Test
    void test_Sort_Sorted_Case(){
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);
        InsertionSort.sort(list);
        assertEquals(Arrays.asList(10,20,30,40,50,60),list);
    }
}
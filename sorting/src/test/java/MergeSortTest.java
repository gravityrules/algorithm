import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void merge_test_data1() {
        List<Integer> finalList =  new ArrayList<>();
        MergeSort.merge(finalList,Arrays.asList(5,7),Arrays.asList(4,8));
        assertEquals(Arrays.asList(4,5,7,8),finalList);
    }

    @Test
    void merge_test_data2() {
        List<Integer> finalList =  new ArrayList<>();
        MergeSort.merge(finalList, Collections.singletonList(1), Collections.singletonList(2));
        assertEquals(Arrays.asList(1,2),finalList);
    }

    @Test
    void merge_test_data3() {
        List<Integer> finalList =  new ArrayList<>();
        MergeSort.merge(finalList,Arrays.asList(1,9),Arrays.asList(10,11));
        assertEquals(Arrays.asList(1,9,10,11),finalList);
    }

    @Test
    void merge_test_data4() {
        List<Integer> finalList =  new ArrayList<>();
        MergeSort.merge(finalList,Arrays.asList(2,8,9),Arrays.asList(2,3,4));
        assertEquals(Arrays.asList(2,2,3,4,8,9),finalList);
    }

    @Test
    void merge_test_data5() {
        List<Integer> finalList =  new ArrayList<>();
        MergeSort.merge(finalList,Arrays.asList(2,2,3),Arrays.asList(3,4,4));
        assertEquals(Arrays.asList(2,2,3,3,4,4),finalList);
    }

    @Test
    void sort_test_dataset1(){
        assertEquals(Arrays.asList(2,3,4,8,9,10), MergeSort.sort(Arrays.asList(10,9,2,3,4,8)));
    }

    @Test
    void sort_test_dataset2(){
        assertEquals(Arrays.asList(2,2,2,2,2), MergeSort.sort(Arrays.asList(2,2,2,2,2)));
    }

    @Test
    void sort_test_dataset3(){
        assertEquals(Arrays.asList(1,2), MergeSort.sort(Arrays.asList(2,1)));
    }

    @Test
    void sort_test_dataset4(){
        assertEquals(Arrays.asList(1,2,4,6,7), MergeSort.sort(Arrays.asList(7,6,4,2,1)));
    }

    @Test
    void sort_test_dataset5(){
        assertEquals(Collections.emptyList(), MergeSort.sort(new ArrayList<Integer>()));
    }
}
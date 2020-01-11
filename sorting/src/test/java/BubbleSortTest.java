import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void test_BubbleSorts_Ascending_DataSet1(){
        List<Integer> intList = Arrays.asList(24,4,6);
        BubbleSort.sort(intList);
        assertEquals(4,intList.get(0));
        assertEquals(6,intList.get(1));
        assertEquals(24,intList.get(2));
    }

    @Test
    void test_BubbleSorts_Ascending_DataSet2(){
        List<Integer> intList = Arrays.asList(24,6,4);
        BubbleSort.sort(intList);
        assertEquals(4,intList.get(0));
        assertEquals(6,intList.get(1));
        assertEquals(24,intList.get(2));
    }

    @Test
    void test_BubbleSort_Ascending_DataSet3(){
        List<Integer> intList = Arrays.asList(12,0,5,10,5,1,16,9);
        BubbleSort.sort(intList);
        assertEquals(0,intList.get(0));
        assertEquals(16,intList.get(7));
        assertEquals(12,intList.get(6));
        assertEquals(Arrays.asList(0,1,5,5,9,10,12,16),intList);
        System.out.println(intList);
    }

    @Test
    void test_BubbleSort_Ascending_DataSet4(){
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
        BubbleSort.sort(intList);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7),intList);
    }
}
import java.util.List;
import java.util.Random;

import static java.util.Collections.swap;

public class QuickSort {
    final static Random random = new Random();
    public static List<Integer> sort(List<Integer> list){
        if (list.size() <2)
            return list;

        int pivot = partition(list);  //gives the pivot to call to recurse. all the magic happens here.
        sort(list.subList(pivot+1,list.size())); //RHS
        sort(list.subList(0,pivot));    //LHS

        return list;
    }

    public static int partition(List<Integer> list) {
        if (list.size() < 1) {
            return -1;
        }
        int pivotIndex = list.size()-1;
        int key = list.get(pivotIndex);
        int start = 0;
        int end = pivotIndex;
        boolean leftToRight = true;
        int count=0;
        while (start < end){
            //this section assumes key is being checked left to right
            System.out.println(leftToRight);
            if (leftToRight && list.get(start) < key){
                start++;
            }
            else if (leftToRight){
                swap(list,start,pivotIndex);
                pivotIndex = start;
                end--;
                leftToRight = false;
            }else if (!leftToRight && list.get(end) > key){
                end--;
            }else if(!leftToRight){
                swap(list,end,pivotIndex);
                pivotIndex = end;
                start++;
                leftToRight = true;
            }
            count++;
        }
        System.out.println(String.format("List: [%s], Counter : %d",list,count));
        return pivotIndex;
    }

//    private static int getPivot(int size) {
//        return random.nextInt(size);
//    }
}

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static List<Integer> mergeSortedList(List<Integer> list1, List<Integer> list2){
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        List<Integer> finalList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
//Alternative approach - refer code in MergeSort.
        while(i<list1.size() && j < list2.size()){
            if(list1.get(i) <list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            finalList.add(list1.get(i++));
        }
        while(j<list2.size()){
            finalList.add(list2.get(j++));
        }

        return finalList;
    }
}

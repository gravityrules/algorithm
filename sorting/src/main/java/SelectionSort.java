import java.util.List;

import static java.util.Collections.swap;

public class SelectionSort {

    public static void sort(List<Integer> list){
        for(int i=0; i<list.size();i++){
            int smallest = list.get(i);
            int smallestIndex = i;
            for(int j=i+1; j<list.size();j++){
                if(list.get(j) < smallest){
                    smallestIndex = j;
                    smallest = list.get(j);
                }
            }
            swap(list,i,smallestIndex);
        }
    }
}

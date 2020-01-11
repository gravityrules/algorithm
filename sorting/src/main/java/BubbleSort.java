import com.sun.istack.internal.NotNull;

import java.util.List;

import static java.util.Collections.swap;

public class BubbleSort {

    public static void sort(@NotNull List<Integer> list){
        int counter1=0;
        int counter2=0;
        int j = list.size()-1;
        while(j > 0) {
            counter1++;
            for (int i = 0; i < j; i++) {
                counter2++;
                if (list.get(i) > list.get(i + 1)) {
                    swap(list, i, i + 1);
                }
            }
            j--;
        }
        System.out.println("counter1, counter2 :" + counter1 + "," + counter2);
    }

}

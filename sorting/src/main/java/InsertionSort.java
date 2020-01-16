import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> list){

        int i=1;
        while (i<list.size()) {
            int key=list.get(i);
            int j=i-1;
            while (j>=0 && list.get(j) >key) {
                //shift jth element
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
            i++;
        }
    }
}

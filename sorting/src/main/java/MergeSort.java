import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> sort(List<Integer> list){

        //if size is 1 then it cant be divided
        int size = list.size();
        if(size<=1)
            return list;

        //div the list in two parts, 0-mid, and mid-end
        List<Integer> lhs = sort(list.subList(0,size/2));
        List<Integer> rhs = sort(list.subList(size/2, size));

        //merge the left + right side

        return merge(new ArrayList<Integer>(), lhs, rhs);

    }

    public static List<Integer> merge(List<Integer> finalList, List<Integer> list1, List<Integer> list2){
        int s1 = 0, s2 = 0;
        while(finalList.size() != list1.size() + list2.size()){
            if (list1.get(s1) > list2.get(s2)) {
                finalList.add(list2.get(s2));
                if (s2 < list2.size()-1) {
                    s2++;
                }
                else{
                    //add rest of the list 1
                    finalList.addAll(list1.subList(s1,list1.size()));
                }
            }else{
                finalList.add(list1.get(s1));
                if(s1 < list1.size()-1) {
                    s1++;
                }else{
                    finalList.addAll(list2.subList(s2,list2.size()));
                }
            }
        }
        return finalList;
    }

}

import java.util.List;

public class BinarySearch {

    public static int searchLoop(List<Integer> list, int key){
        int start = 0;
        int end = list.size()-1;
        while( start <= end){
            //to avoid overflow error don't add start + end/2
            int keyIndex = start + (end - start) /2;
            if (list.get(keyIndex) ==key){
                return keyIndex;
            }else if (list.get(keyIndex) > key){
                //search the LH tree
                end = keyIndex -1;
            }else {
                //search the RH tree
                start = keyIndex + 1;
            }
        }
        //key not found
        return -1;
    }
}

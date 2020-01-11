import java.util.HashSet;
import java.util.List;

public class FirstRecurringElem {
    //google interview example
    public static int firstRecurElem(List<Integer> numbers){
        HashSet<Integer> seen = new HashSet();

        for (int num : numbers){
            if(seen.contains(num))
                return num;
            else
                seen.add(num);
        }
        return -1;
    }
}

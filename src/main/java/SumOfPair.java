import java.util.HashSet;
import java.util.List;

public class SumOfPair {

    //Takes number arrays and int sum as input
    //returns true if there exists a pair in the array that adds up to sum.

    public static boolean findSumOfPair(List<Integer> numbers, int sum){
        HashSet<Integer> complement = new HashSet<Integer>();

        for (Integer number : numbers) {
            if (complement.contains(number))
                return true;
            else
                complement.add(sum - number);
        }

        return false;
    }

}

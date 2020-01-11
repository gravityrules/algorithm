import java.util.ArrayList;

public class Fibonacci {

    private final static ArrayList<Long> fibMemory = new ArrayList<>();

    public static long fibIterative(int num){
        if (num <= 1)   //returns the -ve number as is, could add an exception in real world if need be
            return num;

        long fib1 = 1;
        long fib0 = 0;
        for (int i=2; i <=num;i++){
            long temp = fib1;
            fib1 = fib1 + fib0;
            fib0 = temp;
        }

        return fib1;
    }

    public static long fibRecurse(int num){
        if(num <=1)
            return num;
        return fibRecurse(num-1) + fibRecurse(num-2);
    }

    public static long fibRecurseMemoize(int num){
        if(num <0)
            return num;

        if (!fibMemory.contains(num)) {
            if (num ==0 || num == 1) {//initialize both base case in one shot
                fibMemory.add(0, 0L);
                fibMemory.add(1, 1L);
            }else
                fibMemory.add(num, fibRecurseMemoize(num - 1) + fibRecurseMemoize(num - 2));
        }
        return fibMemory.get(num);
    }
}

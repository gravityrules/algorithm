import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test_Fib_EdgeCase_Zero() {
        assertEquals(0,Fibonacci.fibIterative(0));
        assertEquals(0,Fibonacci.fibRecurse(0));
        assertEquals(0,Fibonacci.fibRecurseMemoize(0));
    }

    @Test
    void test_Fib_EdgeCase_One() {
        assertEquals(1,Fibonacci.fibIterative(1));
        assertEquals(1,Fibonacci.fibRecurse(1));
        assertEquals(1,Fibonacci.fibRecurseMemoize(1));
    }

    @Test
    void test_Fib_EdgeCase_Negative() {
        assertEquals(-1,Fibonacci.fibIterative(-1));
        assertEquals(-1,Fibonacci.fibRecurse(-1));
        assertEquals(-1,Fibonacci.fibRecurseMemoize(-1));
    }

    @Test
    void test_Fib_Num_2() {
        assertEquals(1,Fibonacci.fibIterative(2));
        assertEquals(1,Fibonacci.fibRecurse(2));
        assertEquals(1,Fibonacci.fibRecurseMemoize(2));
    }

    @Test
    void test_Fib_Num_3() {
        assertEquals(2,Fibonacci.fibIterative(3));
        assertEquals(2,Fibonacci.fibRecurse(3));
        assertEquals(2,Fibonacci.fibRecurseMemoize(3));
    }

    @Test
    void test_Fib_Num_4() {
        assertEquals(3,Fibonacci.fibIterative(4));
        assertEquals(3,Fibonacci.fibRecurse(4));
        assertEquals(3,Fibonacci.fibRecurseMemoize(4));
    }

    @Test
    void test_Fib_Num_5() {
        assertEquals(5,Fibonacci.fibIterative(5));
        assertEquals(5,Fibonacci.fibRecurse(5));
        assertEquals(5,Fibonacci.fibRecurseMemoize(5));
    }

    @Test
    void test_Fib_Num_6() {
        assertEquals(8,Fibonacci.fibIterative(6));
        assertEquals(8,Fibonacci.fibRecurse(6));
        assertEquals(8,Fibonacci.fibRecurseMemoize(6));
    }

}
package JavaAlgorithms;

// In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
// The first two numbers of fibonacci series are 0 and 1.

// Revisited at 2020-01
public class FibonacciTest {

    public static void main(String args[]) {

        System.out.println("0 --> " + fibRecursive(0));
        System.out.println("1 --> " + fibRecursive(1));
        System.out.println("2 --> " + fibRecursive(2));
        System.out.println("3 --> " + fibRecursive(3));
        System.out.println("4 --> " + fibRecursive(4));
        System.out.println("5 --> " + fibRecursive(5));
        System.out.println("6 --> " + fibRecursive(6));
        System.out.println("7 --> " + fibRecursive(7));
        System.out.println("8 --> " + fibRecursive(8));
    }

    // Fibonacci Series using recursion
    static int fibRecursive(int in){
        int fib = in;

        // stopping condition
        if(in == 0)
            return 0;

        if(in <= 1)
            return 1;

        // logic
        fib = fibRecursive(in - 1) + fibRecursive(in - 2);
        return fib;
    }
}

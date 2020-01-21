package JavaAlgorithms;

// Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
//    4! = 4*3*2*1 = 24
//    5! = 5*4*3*2*1 = 120
// Revisited at 2020-01

public class FactorialTest {

    public static void main(String args[]) {

        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }

    // Factorial Program using loop in java.
    static int factorialIterative(int factorialOF){

        int fact = 1;
        for(int i = 1; i <= factorialOF; i++){
            fact *= i; // fact = fact * i;
        }
        return fact;
    }

    // Factorial program in java using recursion.
    static int factorialRecursive(int factorialOF){

        int fact = factorialOF;
        // 1 - stopping condition
        if(factorialOF == 1)
            return factorialOF;

        // 2 - logic part
        fact = fact * factorialRecursive(factorialOF - 1);

        return fact;
    }
}

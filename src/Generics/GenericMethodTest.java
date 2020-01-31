package Generics;

// This is mechanical example of Printing array elements using generic method.
// ref GenericMethodTest.java
// Created at 2020-01

public class GenericMethodTest {

    public static void main(String[] args) {

        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
    }

    // generic method printArray
    // NOTE:
    // concept declaring generic method
    // to do so: you start by supplying Type parameter section "<T>" before the return type "void" of the method declaration
    // Type parameter section is set of angle brackets, inside those angle brackets you can supply a comma separated list
    // of so called type parameters, or sometimes called type variables. And those are just generic names, that you'll use
    // sometimes as the return type of the method, but typically in the parameter list of the method and te body of the
    // method, to represent placeholders types.
    // Type name "<T>" is one of the several different generic type names that are commonly used.
    // T - is often used represent Type
    // E - Element in a collection / K - Key, map based data-structure / N - Number / V - Value /
    //
    public static <T> void printArray(T[] inputArray){

        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }

    // This is the same as printArray
    // This is type Erased version of printArray looks like in the compiled version of the code (bytecode)
    public static void printArray2(Object[] inputArray){

        for (Object element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }
}

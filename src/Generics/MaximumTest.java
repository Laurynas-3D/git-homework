package Generics;

// In this example Generic method maximum returns the largest of three objects.
// ref MaximumTest.java
// Created at 2020-01

public class MaximumTest {

    public static void main(String[] args) {

        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximum(3,4,5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
        System.out.printf("Maximum of %s, %s and %s is %s%n", 'L', 'M', 'a', maximum("L", "M", "a"));

    }

    // determines the largest of three Comparable objects
    // NOTE:
    // Type parameter section in this case - whatever type is used with this maximum method, the Type must be something
    // that has "IS A" relationship with the Interface Comparable
    // <T extends Comparable<T>> - says - that the Type T whatever type object that is must implement the comparable interface
    // In generic method declarations and specifically in type parameter section, whether you are checking that a type
    // implements an interface, or extends a class, you use in both cases the EXTENDS keyword in this syntax.
    // anything that is not comparable is not going to compile.
    // All of the objects that we are passing to the maximum method have to have the same type. maximum(T x, T y, T z)
    // by using type parameter T three times.
    // the int values 3,4,5 will be boxed as Integer objects.
    // String object are comparable, Integer objects are comparable, Double object are comparable, Chars are comparable
    // we are using Type parameter not only to declare parameters in the parameters list, but to declare return type of
    // this method / "T" before method name
    // So maximum will receive three things of the same Type and return one thing of that same Type
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){

        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far
        if (z.compareTo(max) > 0)
            max = z; // z is the largest object
        return max;  // returns the largest object
    }
}

package Generics;

import java.util.ArrayList;

/**
 * Wildcards in Methods That Accept Type Parameters - Method sum with Wildcard Type
 *
 * ref WildcardTest.java
 *
 * Created at 2020-02
 */

public class WildcardTest {

    // NOTE:
    // you can not pass an Object of type ArrayList<Integer> to a method that expects to receive an ArrayList<Number>
    // even thou Number is a super-class of Integer. This Example is going to fix that problem.
    //
    // Wildcards are nice for situation like this, but there are some limitations.
    // One of limitation, you cannot use question-mark (?) in the body of the method for the purpose of declaring local
    // variables. For example: at line 87 Number it is always going to use the upper bound Number, to refer the elements
    // in the ArrayList passed in there, is no way for us to use the wildcard to specify the type name for the purpose to
    // make this type more specific.
    // If we really need to do that, we need to introduce type parameter section for a Generic type name such as <T>
    // and say <T extends Number> in the type parameter section, then we can replace this wildcard and use type name <T>
    // in the body of the loop as well. (Instead word Number)
    //
    // Also if for any reason, a wildcard does not have upper bound, then when you manipulating the elements, in this case,
    // the ArrayList, you will only be able to use the methods of class Object, on the individual elements within the List
    // it is important, when you use wildcards typically to specify an upper bound for the elements that you are manipulating

    public static void main(String[] args) {

        // create, initialize and output ArrayList of Integers, then
        // display total of the elements
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>();

        // insert elements in integerList
        for (Integer element : integers)
            integerList.add(element);

        System.out.printf("integerList contains: %s%n", integerList);
        // NOTE:
        // calling sum() with the argument integerList.
        // sum is expecting to receive an ArrayList of sum type that extends Number
        // in this case ArrayList is an ArrayList of type Integer and Integer extends Number. So that satisfies wildcard
        // requirement.
        System.out.printf("Total elements in integerList: %.0f%n%n", sum(integerList));

        // create, initialize and output ArrayList of Doubles, then
        // display total of the elements
        Double[] doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>();

        // insert elements in doubleList
        for (Double element : doubles)
            doubleList.add(element);

        System.out.printf("doubleList contains: %s%n", doubleList);

        System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));

        // create, initialize and output ArrayList of Numbers containing
        // both Integers and Doubles, then display total of the elements
        Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        // insert elements in numberList
        for (Number element : numbers)
            numberList.add(element);
        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));

    } // end main

    // total the elements; using wildcard in the ArrayList parameter
    // NOTE:
    // "ArrayList<? extends Number>" wildcard type parameter
    // we are saying that, the ArrayList in this case can be any type that extends class Number
    // that means it can be ArrayList of Integers, ArrayList Double, ArrayList Float....
    public static double sum(ArrayList<? extends Number> list){

        // initialize total
        double total = 0 ;

        // calculate sum
        for (Number element : list)
            total += element.doubleValue();
        return total;
    }
}

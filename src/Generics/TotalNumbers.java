package Generics;

import java.util.ArrayList;

/**
 * Wildcards in Methods That Accept Type Parameters - Totaling numbers in ArrayList
 *
 * ref TotalNumbers.java
 *
 * Created at 2020-02
 */

public class TotalNumbers {

    public static void main(String[] args) {

        // create, initialize and output ArrayList of Numbers containing
        // both Integers and Doubles, then display total of the elements

        // NOTE:
        // The types Int and Double cannot be stored in a referenced type array, but they can be boxed in to objects
        // that can in turned be stored in a reference type array.
        // And an int can be boxed in to a Integer which is a number and the double can be boxed in to Double which is a
        // number.. Every numeric type wrapper classes extends the super class java.lang.Number, all of those numeric
        // type wrapper classes have the "IS A" relationship with type Number.
        Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element : numbers)
            numberList.add(element); // place each number in numberList

        System.out.printf("numberList contains %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    // calculate total of ArrayList elements
    public static double sum(ArrayList<Number> list){

        double total = 0; // initialize total

        // calculate sum
        // NOTE:
        // we walk through every number in the list, and for each of those numbers we ask to give us it's double value,
        // the Number class method has intValue and doubleValue methods.
        // doubleValue() is going to give back a value of primitives type double, representing contents of the number
        // object and add that to my total.
        for (Number element : list)
            total += element.doubleValue();

        return total;
    }
}

package DataStructures;

import java.util.Arrays;
import java.util.TreeSet;


/**
 This program:
 - Demonstrates how TreeSet works.
 - Convert TreeSet to Array.

 Created at 2020-02
 ref HashSetTest.java
 */

public class TreeSetTest {

    public static void main(String[] args){

        // TreeSet elements are sorted in ascending order by default.
        // TreeSet doesn't allow null Object and throw NullPointerException.
        TreeSet<String> ts1 = new TreeSet<String>();
        TreeSet<Integer> ts2 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("Vilnius");
        ts1.add("Kaunas");
        ts1.add("Klaipėda");
        ts1.add("Panevėžys");
        ts1.add("Ukmergė");
        ts1.add("Biržai");
        ts1.add("Vilnius"); // adding duplicate elements; Duplicates will not get insert

        // Elements get stored in default natural Sorting Order(Ascending)
        System.out.println(ts1);
        System.out.println("TreeSet size is: " + ts1.size());
        System.out.println("List contains Ukmergė: " + ts1.contains("Ukmergė"));

        ts2.add(8); // first add 8
        ts2.add(7);
        ts2.add(6);
        ts2.add(5);
        ts2.add(4);
        ts2.add(3);

        // Elements get stored in default natural Sorting Order(Ascending)
        System.out.println("New TreeSet list: " + ts2);
        System.out.println("tailSet from 3: " + ts2.tailSet(3));
        System.out.println("tailSet from 4: " + ts2.tailSet(4));
        System.out.println("headSet to 4: " + ts2.headSet(5));
        System.out.println("first(): " + ts2.first());
        System.out.println("last(): " + ts2.last());

        Object[] array = ts1.toArray();
        System.out.println("Array print: " + Arrays.toString(array));


    }
}


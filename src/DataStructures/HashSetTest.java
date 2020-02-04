package DataStructures;

import java.util.HashSet;
import java.util.Iterator;

/**
 This program:
    - Demonstrates how HashSet works.

 Created at 2020-02
 ref HashSetTest.java
 */

class HashSetTest
{
    public static void main(String[]args){
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet using add()
        h.add("Vilnius");
        h.add("Kaunas");
        h.add("Klaipėda");
        h.add("Panevėžys");
        h.add("Ukmergė");
        h.add("Biržai");
        h.add("Vilnius"); // adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains Kaunas: " + h.contains("Kaunas"));
        System.out.println("List size: " + h.size());

        // Removing items from HashSet using remove()
        h.remove("Biržai");
        System.out.println("List after removing Biržai: "+h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
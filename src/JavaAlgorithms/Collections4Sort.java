package JavaAlgorithms;

// This is mechanical example of Collections method sort
// ref Sort2.java / Sort3.java
//
// Revisited at 2020-01

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections4Sort {

    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n ", list);

        Collections.sort(list); // sort ArrayList
        System.out.printf("Sorted array elements: %-40s%n", list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted array elements in reversed order: %s%n", list);


    }
}

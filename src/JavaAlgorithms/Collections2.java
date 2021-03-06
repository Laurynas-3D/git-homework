package JavaAlgorithms;

// This is demonstration of Collections methods reverse, fill, copy, max and min
// ref Algorithms1.java
// Revisited at 2020-01


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections2 {

    public static void main(String[] args) {

        // create and display a List< Character >
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // reverse and display the List< Character >
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains: %n");
        output(copyList);

        // fill list with Rs
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains: %n");
        output(list);
    }

    // output List information
    private static void output(List<Character> listRef){
        System.out.println("The list is: ");
        for (Character element : listRef)
            System.out.printf("%s ", element);

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min: %s", Collections.min(listRef));
    }
}

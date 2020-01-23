package JavaAlgorithms;

// This is demonstration of Collection classes methods reverse, fill, copy, max and min.
// Revisited at 2020-01

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        // create and display a List< Character >
        Character[] letters = {'P', 'C', 'M', 'B', 'Z', 'W', 'L', 'F', 'K' };
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // reverse and display the List< Character >
        Character[] lettersCopy = new Character[9];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%n%nAfter copying, copyList contains: %n");
        output(copyList);

        // fill list with Rs
        Collections.fill(list, 'R');
        System.out.printf("%n%nAfter calling fill, list contains: %n");
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

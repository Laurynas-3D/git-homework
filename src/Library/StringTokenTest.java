package Library;
/**
 This program:
 - simple code shows StringTokenizer object used to tokenize strings

 Some Notes:
 - https://regex101.com/ - Online regex tester

 Created at 2020-02
 */

import java.util.Scanner;

public class StringTokenTest {

    public static void main(String[] args) {

        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter:");
        String sentence = scanner.nextLine();

        // process user sentence
        String[] tokens = sentence.split("(\\s|,|\\.)");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        for (String token : tokens)
            System.out.println(token);
    }
}
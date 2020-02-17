package Library;
/**
 This program:
 - Demonstrates String methods replaceFirst, replaceAll and split

 Some Notes:
 - https://regexr.com/

 Created at 2020-02
 */

import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {

        String firstString = "This sentence ends in 5 stars ******";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        // we display original string
        System.out.printf("Original String 1: %s%n", firstString);

        // NOTE:
        // replace '*' with '^'
        // we will modify the string by replacing all occurrences of the asterisk characters with the caret characters
        // when you call replaceAll() on the original string it does not actually modify that string, it creates
        // entirely new string, but because we want first string to now refer to the new one, we take result to
        // replaceAll() call and we assign to the variable firstString, and we can display that string later on
        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *:%s%n", firstString);

        // replace 'stars' with 'carets'
        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf("\"carets\" substituted for \"stars\": %s%n", firstString);

        // replace words with 'word'
        System.out.printf("Every word replaced by \"word\": %s%n%n", firstString.replaceAll("\\w+", "word"));

        System.out.printf("Original String 2: %s%n", secondString);

        // replace first three digits with 'digit'
        for (int i = 0; i < 3; i++)
            secondString = secondString.replaceFirst("\\d", "digit");

        System.out.printf("First 3 digits replaced by \"digit\" : %s%n", secondString);

        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*"); //split on commas
        System.out.println(Arrays.toString(results)); // display results

    }
}

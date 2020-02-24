package IO;
/**
 This program:
 - Writes data to a sequential text file with class Formatter

 Some Notes:
 -

 Created at 2020-02
 */

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    private static Formatter output; // outputs text to a file

    public static void main(String[] args) {

        openFile();
        addRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile(){
        try{
            output = new Formatter("clients.txt"); // open the file
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // add records
    public static void addRecords(){

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n", "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to the input. / Windows CTRL+Z / MAC and Linux CTRL+D ");

        while (input.hasNext()) // loop until end-of-file indicator
        {
            try {
                // output new record to file; assumes valid input
                output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
            catch (FormatterClosedException formatterClosedException){
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch (NoSuchElementException elementException){
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            System.out.print("> ");
        }
    }

    // close file
    public static void closeFile(){

        if (output != null)
            output.close();
    }
}

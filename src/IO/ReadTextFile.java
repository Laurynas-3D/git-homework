package IO;
/**
 This program:
 - Read's from a sequential text file using a Scanner

 Some Notes:
 -

 Created at 2020-02
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {

        openFile();
        addRecords();
        closeFile();

    }

    // open file clients.txt
    public static void openFile() {
        try{
            input = new Scanner(Paths.get("clients.txt"));
        }
        catch (IOException oiException){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First name", "Last name", "Balance");
        try {
            while (input.hasNext()) {
                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(),
                        input.nextDouble());
            }

        }
        catch (NoSuchElementException elementException){
            System.err.println("File improperly formed. Terminating.");
        }
        catch (IllegalStateException stateException){
            System.err.println("Error reading from file. Terminating.");
        }

    }

    public static void closeFile() {
        if (input != null)
            input.close();
    }
}

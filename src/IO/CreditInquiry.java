package IO;
/**
 This program:
 - This program reads a file sequentially and displays the contents based on the type of account the user requests
 (credit balance, debit balance or zero balance)

 Some Notes:
 -

 Created at 2020-02
 */

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {

    private final static CreditInquiryMenuOption[] choices = CreditInquiryMenuOption.values();
    String fileName = "testFile1.txt";
    String filePath = "..\\git-homework\\src\\IO";

    public static void main(String[] args) {



        // get users request (e.g., zero, credit or debit balance)
        CreditInquiryMenuOption accountType = getRequest();

        while (accountType != CreditInquiryMenuOption.END)
        {
            switch (accountType)
            {
                case ZERO_BALANCE:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }

            readRecords(accountType);
            accountType = getRequest(); // get user's request
        }
    }

    // obtain request from user
    private static CreditInquiryMenuOption getRequest(){

        int request = 4;

        // display request options
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                "1 - List accounts with zero balances",
                "2 - List accounts with credit balances",
                "3 - List accounts with debit balances",
                "4- Terminate program");
        try{
            Scanner input = new Scanner(System.in);
            do {
                System.out.printf("%n? ");
                request = input.nextInt();

            }
            while ((request < 1) || (request > 5));
        }
        catch (NoSuchElementException noSuchElementException){
            System.out.printf("Invalid input. Terminating.");
        }
        return choices[request - 1]; // return enum value for option

    }

    // read records from file and display only records of appropriate type
    private static void readRecords(CreditInquiryMenuOption accountType){

        // open file and process contents

        // NOTE:
        // Try with resources statement.
        // it is a try block followed by a set of parenthesis after the keyword in which we create an object that is
        // going to be used only for the duration of the try block, and if the try block terminates for any reason the
        // object that is created in those parenthesis will have its closed method called

        // NOTE:
        // Class Scanner implements important Interface "AutoClosable"
        // Anything that is AutoClosable provides method called "close()" that you use to close the resource when you
        // are done with that resource
        // When we create a Scanner that is attached to our clients.txt file, we want that file to be closed either if
        // the exception occurs in the try block while using the file or the try block terminates successfully
        // for what ever reason try block terminates we are going to have the close() method called on that input object
        // which means we do not need finally block at the end of this try catch sequence
        try (Scanner input = new Scanner(Paths.get("..\\git-homework\\src\\IO\\clients.txt"))){
            while (input.hasNext()) // more data to read
            {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                // if proper account type, display record
                if (shouldDisplay(accountType, balance))
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
                else
                    input.nextLine(); // discard the rest of the current record
            }
        }

        // NOTE:
        // multi catch capability
        // regardless of what type of exception is thrown in try block if a exception is thrown we are going to catch
        // all of them in here and for any exception we just going to indicate that was an error processing the file and
        // then we will terminate the application
        // we dont have to worry about improperly closing the file because it will be closed before catch handler
        // executes
        catch (NoSuchElementException | IllegalStateException | IOException e){
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    } // end method readRecords

    // use record type to determine if record should be displayed
    private static boolean shouldDisplay(CreditInquiryMenuOption accountType, double balance){
        if ((accountType == CreditInquiryMenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if ((accountType == CreditInquiryMenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else if ((accountType == CreditInquiryMenuOption.ZERO_BALANCE) && (balance == 0))
            return true;

        return false;
    }

}

enum CreditInquiryMenuOption {

    // declare content of enum type
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    // current menu option
    private final int value;

    // constructor
    private CreditInquiryMenuOption(int value){
        this.value = value;
    }
}


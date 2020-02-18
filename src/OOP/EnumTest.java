package OOP;
/**
 This program:
 - Declares an enum type with a constructor and explicit instance fields and access

 Some Notes:
 -

 Created at 2020-02
 */
import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {

        System.out.println("All books:");

        // NOTE:
        // print all books in enum Book
        // using enhanced for loop, to do that
        // we declare a range variable "book" of type "Book" which is our enum type and on the right side colon we say
        // Book.values() this is a method that is automatically generated for us in every enum type that gives back
        // basically list of constance inside of enum Type in the same order that they are declared within that type
        // as we iterate through these and display each of these books as String information
        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());

        System.out.printf("%nDisplay a range of enum constants:%n");

        // NOTE:
        // print first four books
        // EnumSet class gives you a way to create a sub set of the constance within of enum type
        // EnumSet method .range which is a static method of class EnumSet takes two constance from the enum as arguments
        // the starting constance in the range and the ending constance in the range and the we can iterate through each
        // of those constance to produce a similar output what we did up above but only for the range of constance specified
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
    }
}

enum Book {

    // declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // instance fields
    private final String title;
    private final String copyrightYear;

    // NOTE:
    // enum constructor
    // the constructor in enum has to be either declared private explicitly or not declared at all with a access
    // specifiers, you cant list them as public, you cant list them as protected either. So either there are no access
    // specifiers as we did here or you can insert private keyword in front of the constructor and again reason for that
    // is only this enum type can use the constructor
    Book(String title, String copyrightYear){
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    // accessor for field title
    public String getTitle(){
        return title;
    }

    // accessor for field copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    }

}

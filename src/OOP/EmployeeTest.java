package OOP;

/**
 This program:
 - Composition demonstration with classes Date and Employee

 Some Notes:
 -

 Created at 2020-02
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(7, 24,1949);
        Date hire = new Date(3,12,1988);
        Employee2 employee = new Employee2("Bob", "Blue", birth, hire);
        System.out.println(employee);
    }

} // end class EmployeeTest

class Employee2 {

    // NOTE:
    // In the employee class we have instance type variables
    // each of these are reference to an object, references to objects get initialized to null as instance variables by
    // default unless you provide a constructor that's required to be called in which case those instance variables will
    // be initialized to what you provide, in our example we receive four pieces of information two String and two Date
    // objects and the references to
    // those objects are going to be then assigned to the corresponding instance variables
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // constructor to initialize name, birth date and hire date
    public Employee2(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;

    }

    // NOTE:
    // convert Employee to String format
    // there are no local variables, we do not use "this" keyword
    // we can refer to them explicitly just by the name
    // or we can use implicit method using "this" keyword in front of them
    public String toString(){
        return String.format("%s, %s, Hired: %s   Birthday: %s", lastName, firstName, hireDate, birthDate);

    }
} // end class Employee

class Date {

    // NOTE:
    // This Date class has a month, has a day, has a year
    // when your instance variables has a primitive type variables they are fully composed in to the objects that are
    // created. So when i say create a new date, that object physically contains a for byte integer for the month a four
    // byte integer by the day and four byte integer by the year
    private int month; // 1 - 12
    private int day; // 1 - 31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year){

        // check if month in range
        if ( month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0 || (day > daysPerMonth[month] && !( month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        // NOTE:
        // check for leap year if month is 2 and day is 29
        // so first we say if month is February and the day is 29th of February AND the result of the following expression
        // is not true
        // year divisible by 400, if the year is divisible by 400 (year % 400 == 0) then it is a leap year OR if the year
        // is divisible by 4 (year % 4 == 0) AND (&&) the year is not divisible by 100 (year % 100 != 0) it is a leap year
        // finally if the month is February and the day is 29 and it is not a leap year then we will throw an
        // IllegalArgumentException
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out of range for the specified month and year");

        // NOTE:
        // if we passed all those if statements, then we have valid month, day and year. And we will assign those values
        // to our instance variables
        this.month = month;
        this.day = day;
        this.year = year;

        // NOTE:
        // [00:06:45]
        // we display string representation of the date object we just created, and we are outputting value "this" as a
        // string, "this" is the reference to the current Date object (public Date(int month...)) is being constructed
        // and so we ar getting a call toString() method we defined below implicitly
        // we could wrote toString() with empty parenthesis here , we can write this.toString() or we simply can say
        // output "this" object as a string in which case implicitly calls toString() for us
        System.out.printf("Date object constructor for date %s%n", this);
    }

    // return a String of the form month/day/year
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }

} // end class Date
package Library;
/**
 * This program:
 * - Compound-interest calculations with for loop
 *
 * Some Notes:
 * - refs Interest.java
 *
 * Created at 2020-03
 */

public class InterestCalc {

    public static void main(String[] args){

        // NOTE:
        // A person invests $1,000 in a savings account yielding 5% interest. Assuming that all the interest is left on
        // deposit, calculate and print the amount of money in the account at the end of each year for 10 years.
        // Use the following formula to determine the amounts:
        // a = p(1+r)n

        // p is the original amount invested (i.e., principal)
        // r is the annual interest rate (e.g., use 0.05 for 5%)
        // n is the number of years
        // a is the amount on deposit at the end of the nth year

        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        // NOTE:
        // System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        // we display a column heads first using:
        // %s to display string year
        // %20s to display string Amount on deposit
        // when you have integer between (%) sign and format specifier (s) that integer (20) represents a field width
        // and in this case we want 15 character string (Amount on deposit) to be displayed in a total of 20 character
        // positions in the line of text and by default it will be right justified within those 20 characters
        // if you want to be left justified you would insert a (-) sign before integer value (%-20s)

        // NOTE:
        // System.out.printf("%4d%,20.2f%n", year, amount);
        // we will display two columns of information (%4d) in a field of 4 right justified we display year number
        // (%,20.2f) in a field of 20 right justified with two digits right to the decimal point we are going to display
        // amount and this comma (,) at the beginning here indicates that we would like the amount to be displayed with
        // thousands separators as part of it, so we have a value of 1000 in the United States locale its going to be
        // displayed as 1,000.00 and in European locale it would be 1.000,00 so it is going to be locale specific string
        // that gets displayed

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <=10; year++){
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}

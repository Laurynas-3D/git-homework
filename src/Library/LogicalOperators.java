package Library;
/**
 * This program:
 * - Demonstration of Logical operators
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */
public class LogicalOperators {

    public static void main (String[] args){

        // create a truth table for && (conditional AND) operator

        // NOTE:
        // it combines two expressions if and only both those expressions are true, will the entire expression be true
        // this is short circuit operator - as soon as the left hand side of the expression is evaluated
        // if we can can tell right away whether the whole expression is true or false then the right side of expression
        // will not be evaluated
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));


        // create a truth table for || (conditional OR) operator

        // NOTE:
        // we get true in three out of four cases if either the left side or the right side or both sides are true
        // then the entire expression is true
        // if both sides is false, then expression is false
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // create truth table for & (boolean logical AND) operator

        // NOTE:
        // boolean logical AND (&) is identical to the conditional (&&) with one exception, the conditional (&&) uses short
        // circuit evaluation and the boolean logical (&) guarantees that the both it's left side and it's right side of
        // expressions
        // will be evaluated no matter what.
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical AND (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));

        // create truth table for | (boolean logical inclusive OR) operator

        // NOTE:
        // single vertical bar (|) works just like double vertical bar (||) the conditional OR, the only difference is
        // that conditional OR is a short circuit evaluation operator where is the boolean logical inclusive OR (|)
        // guarantees you that it will evaluate both expressions on either side of the operator every single time
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical AND (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));

        // create truth table for ^ (boolean logical exclusive OR) operator

        // NOTE:
        // caret operator (^) and this differs from the inclusive OR (|) in that only ONE of the TWO sides can be true
        // for the entire expression to be true.
        // in case if you want to one or other to be TRUE but not BOTH
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical AND (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true)); // this becomes false

        // create truth table for ! (logical negation) operator

        // NOTE:
        // you can apply any condition to reverse it's value

        System.out.printf("%s%n%s: %b%n%s: %b%n",
                "Logical NOT (!)",
                "!false", (!false),
                "!true", (!true));
    }
}

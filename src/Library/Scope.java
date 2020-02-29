package Library;
/**
 * This program:
 * - Scope class demonstrates field and local-variable scopes mechanical example to demonstrate concepts of Scopes in Java
 *
 * Some Notes:
 * Key things you have to keep in mind - is if you are using static methods, static methods of the class have access
 * only to other static members within the class.
 * Main can call useLocalVariable() and useField directly() because they both declared static.
 * And then separately useField() method can use static variable x in the class specifically because it was declared
 * as static variable
 *
 * Created at 2020-02
 */

public class Scope {

    // class variable, this is static field of the class,
    // scope of this is entire class body
    private static int x = 1;

    public static void main(String[] args){

        int x = 5; // local variable in main

        // NOTE:
        // whenever you have local variable who has same name as field variable, the field is shadowed or hidden, inside
        // that local scope while that local variable is in scope. For the rest of main if i am to use variable x anywhere
        // in main i am always referring to that one on line 11

        System.out.printf("local x in main is %d%n", x );

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("local x in main is %d%n", x );

    }

    public static void useLocalVariable(){

        // local variables are created on each call, java does not support concept static local variables
        int x = 25; //local variable in useLocalVariable
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x );
        ++x; // modifies this method's local variable x
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }

    // modify class Scope's field x during each call

    public static void useField(){

        System.out.printf("%nfield x on entering method useField is %d%n", x );
        // this uses whatever version of x is in scope at a given time
        x *= 10; // modifies class Scope's field x
        System.out.printf("field x before exiting method useField is %d%n", x );
    }
}

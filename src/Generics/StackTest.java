package Generics;

/**
 * In this example Generic Classes - Implementing a Generic Stack Class.
 * Example is with Stack data-structure.
 *
 * Some IDE's are not correctly show error stack trace because of the buffering methods inside IDE.
 * This output was generated over command line.
 *
 * ref StackTest.java
 *
 * Created at 2020-02
 */
/*
    Correct Output should look like this:

    Pushing elements onto doubleStack
    1.1 2.2 3.3 4.4 5.5
    Popping elements from doubleStack
    5.5 4.4 3.3 2.2 1.1
    udemy_fundamentals_se_part3.EmptyStackException: Stack is empty, cannot pop
            at udemy_fundamentals_se_part3.Stack.pop(StackTest.java:123)
            at udemy_fundamentals_se_part3.StackTest.testPopDouble(StackTest.java:54)
            at udemy_fundamentals_se_part3.StackTest.main(StackTest.java:26)
            at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.base/java.lang.reflect.Method.invoke(Method.java:566)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:404)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:179)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:119)
    1 2 3 4 5 6 7 8 9 10
    Popping elements from integerStack
    10 9 8 7 6 5 4 3 2 1
    udemy_fundamentals_se_part3.EmptyStackException: Stack is empty, cannot pop
            at udemy_fundamentals_se_part3.Stack.pop(StackTest.java:123)
            at udemy_fundamentals_se_part3.StackTest.testPopInteger(StackTest.java:85)
            at udemy_fundamentals_se_part3.StackTest.main(StackTest.java:30)
            at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.base/java.lang.reflect.Method.invoke(Method.java:566)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:404)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:179)
            at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:119)
 */

import java.util.ArrayList;

public class StackTest {

    public static void main(String[] args) {

        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        // push elements of doubleElements onto doubleStack
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack); // pop from doubleStack

        // push elements of integerElements onto integerStack
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);  // pop from integerStack
    }

    // test push method with double stack
    private static void testPushDouble(Stack<Double> stack, double[] values){
        System.out.printf("%nPushing elements onto doubleStack%n");

        // push elements to Stack
        for (double value : values){
            System.out.printf("%.1f ", value);
            stack.push(value); // push onto doubleStack
        }
    }

    // test pop method with double stack
    private static void testPopDouble(Stack<Double> stack){

        // pop elements from stack
        try{
            System.out.printf("%nPopping elements from doubleStack%n");
            double popValue; // store element removed from stack

            // remove all elements from Stack
            while (true){
                popValue = stack.pop(); // pop from doubleStack
                System.out.printf("%.1f ", popValue);
            }
        }
        catch (EmptyStackException emptyStackException){
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    // test push method with integer stack
    private static void testPushInteger(Stack<Integer> stack, int [] values){

        // push elements to Stack
        for (int value : values){
            System.out.printf("%d ", value);
            stack.push(value); // push onto integerStack
        }
    }

    // test pop method with integer stack
    private static void testPopInteger(Stack<Integer> stack){

        try {

            // pop elements from stack
            System.out.printf("%nPopping elements from integerStack%n");
            int popValue; // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = stack.pop(); // pop from intStack
                System.out.printf("%d ", popValue);
            }
        }
        catch (EmptyStackException emptyStackException){
            System.err.println();
            emptyStackException.printStackTrace();
        }

    }

} // end class StackTest


class Stack<T>{

    private final ArrayList<T> elements; // ArrayList stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack(){

        this(10); // default stack size
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity){

        // checks the capacity make sures its grater than zero if not, it sets it to 10
        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<T>(initCapacity); // create ArrayList
    }

    // push element onto stack
    public void push(T pushValue){
        elements.add(pushValue); // place pushValue on Stack
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop(){
        if (elements.isEmpty()) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1);
    }

} // end class Stack<T>


class EmptyStackException extends RuntimeException{

    // no-argument constructor
    public EmptyStackException(){
        this("Stack is empty");
    }

    // one-argument constructor
    public EmptyStackException(String message){
        super(message);
    }

} // end class EmptyStackException

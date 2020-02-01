package Generics;

import java.util.ArrayList;

/**
 * In this example Passing generic Stack objects to generic methods.
 *
 * We are using here Stacks data-structure
 *
 * ref StackTest2.java
 *
 * Created at 2020-02
 */

public class StackTest2 {

    public static void main(String[] args) {

        // NOTE:
        // Declaring Integer and Double arrays, this time we are using reference types rather than primitive types
        // That is because we are going to pass them now to Generic methods. And Generic methods can not use generic
        // types for primitive type value.
        // So we switched these from primitive type double and primitive type int to the reference type Double and
        // reference type Integer
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack2<Double> doubleStack2 = new Stack2<>(5);
        Stack2<Integer> integerStack2 = new Stack2<>();

        // push elements of doubleElements onto doubleStack
        testPush("doubleStack", doubleStack2, doubleElements);
        testPop("doubleStack", doubleStack2);  // pop from doubleStack

        // push elements of integerElements onto integerStack
        testPush("integerStack", integerStack2, integerElements);
        testPop("integerStack", integerStack2); // pop from integerStack
    }

    // generic method testPush pushes elements onto a Stack
    public static <T> void testPush(String name, Stack2<T> stack2, T[] elements){

        System.out.printf("%nPushing elements onto %s%n", name);

        // push elements on to Stack
        for (T element : elements){
            System.out.printf("%s ", element);
            stack2.push(element); // push element onto stack
        }
    }

    // generic method testPop pops elements from a Stack
    public static <T> void testPop(String name, Stack2<T> stack2){

        try {
            // pop elements from stack
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue;  // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = stack2.pop(); // pop from stack
                System.out.printf("%s ", popValue);
            }
        }
        catch (EmptyStackException2 emptyStackException2){

            // Print stack trace by tutorial
            // System.out.println();
            // emptyStackException2.printStackTrace();

            // My modified version
            System.out.println(emptyStackException2);

        }
    }


} // end class StackTest2

class Stack2<T>{

    private final ArrayList<T> elements; // ArrayList stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack2(){

        this(10); // default stack size
    }

    // constructor creates a stack of the specified number of elements
    public Stack2(int capacity){

        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<T>(initCapacity);  // create ArrayList
    }

    // push element onto stack
    public void push(T pushValue){

        elements.add(pushValue); // place pushValue on Stack
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop(){

        if (elements.isEmpty()) // if stack is empty
            throw new EmptyStackException2("Stack is empty, cannot pop");

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1);
    }

} // end class Stack2<T>

class EmptyStackException2 extends RuntimeException{

    // no-argument constructor
    public EmptyStackException2(){

        this("Stack is empty");
    }

    // one-argument constructor
    public EmptyStackException2(String exception){

        super(exception);
    }

} // end class EmptyStackException2
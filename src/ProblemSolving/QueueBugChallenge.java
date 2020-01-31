package ProblemSolving;

// From SDA courses:
// This program has a bug / Task is to find the bug
// prints not correctly: edcbae
// should be without first e
// TODO: find a bug.

import java.util.Queue;

/**
 * Bug found! in print method "int i" was set to zero. This is not arrays data structure. Counter control loop should
 * start loop from position 1
 */
// Revisited 2020-01

public class QueueBugChallenge {

    public static void main(String args[]){

        QueueImplementation queue = new QueueImplementation();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        queue.print();

        System.out.println(queue.dequeue());

        // System.out.println(q.dequeue());
        // while(!q.isEmpty())
        // System.out.println(q.dequeue());
        // q.enqueue('c');
        // System.out.println(q.dequeue());

        queue.printEnhancedLoop();
    }
}

class QueueImplementation {

    char[] queue;
    int headIdx;

    public QueueImplementation(){

        queue = new char[5];
        headIdx = queue.length - 1;
    }

    public void enqueue(char c){
        // add resizing logic if you want
        queue[headIdx] = c;
        headIdx--;
    }

    public char dequeue(){
        int oldHead = headIdx + 1;
        // System.out.println(headIdx);
        headIdx++;
        return queue[oldHead];
    }

    public char tail(){
        return queue[0];
    }

    public char head(){
        return queue[headIdx];
    }

    public boolean isEmpty(){
        return (head() == tail());
    }

    public void print(){
        System.out.print("\nPrinting with Counter control loop - ");
        for(int i = 1; i < queue.length; i++)
            System.out.print(queue[i]);

    }

    public void printEnhancedLoop(){
        System.out.print("\nPrinting with Enhanced loop        - ");
        for (Character element : queue )
            System.out.printf("%s", element);
    }

}

package ProblemSolving;

// This program has a bug - Task is to find the bug
// From SDA courses
// prints not correctly: edcbae
// should be without first e
// TODO: find a bug

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

        for(int i = 0; i < queue.length; i++)
            System.out.print(queue[i]);

    }

}

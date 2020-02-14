package Concurrency;

/**
 This program: / from SDA course
 - Runnable interface in Java

 Some Notes:
 - java.lang.Runnable is an interface that is to be implemented by a class whose instances are intended
    to be executed by a thread.
 - 1. Create a Runnable implementer and implement run() method.
 - 2. Instantiate Thread class and pass the implementer to the Thread, Thread has a constructor which accepts
    Runnable instance.
 - 3. Invoke start() of Thread instance, start internally calls run() of the implementer. Invoking start(),
    creates a new Thread which executes the code written in run()
 - Calling run() directly does not create and start a new Thread, it will run in the same thread. To start
    a new line of execution, call start() on the thread.

 Created at 2020-02
 */

public class SimpleThread {
    public static void main(String[] args){

        // Task 0
        Runnable runnableBlock0 = () -> {
            System.out.println("Im running in: " + Thread.currentThread().getName() +
                    "with priority: " + Thread.currentThread().getPriority());
        };

        // Task 1
        Runnable runnableBlock1 = () -> {
            for(int i = 0; i < 50; i++)
                System.out.println("runnableBlock1" + i);
        };

        // Task 2
        Runnable runnableBlock2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Im running in: " + Thread.currentThread().getName() +
                        "with priority: " + Thread.currentThread().getPriority());
            }
        };

        Thread t0 = new Thread(runnableBlock0);
        t0.start();
//        t0.run();

        Thread t1 = new Thread(runnableBlock1);
        t1.start();

        for(int i = 0; i < 50; i++)
            System.out.println("main" + i);
    }
}

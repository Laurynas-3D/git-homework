package Concurrency;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Creating and Executing Threads with the Executor Framework
 *
 * Using an ExecutorService to execute Runnables.
 * PrintTask class sleeps for a random time from 0 to 5 seconds
 *
 * ref TaskExecutor.java
 *
 * Created at 2020-02
 */

public class TaskExecutor {

    public static void main(String[] args) {

        // create and name each runnable
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");

        System.out.println("Starting Executor");// shut down ExecutorService--it decides when to shut down threads

        // create ExecutorService to manage threads
        //
        // NOTE:
        // the class Executors has a method .newCachedThreadPool(), is basically is a set of threads where the threads
        // get created as needed for your application.
        // This is going to return an ExecutorService named executorService, is used to launch concurrent tasks.
        ExecutorService executorService = Executors.newCachedThreadPool();

        // start the three PrintTasks
        //
        // NOTE:
        // Once you have an ExecutorService it is going to be responsible to creating threads for you.
        // And it may actually never create a threads, it is up to ExecutorService to figure out additional threads are
        // necessary.
        executorService.execute(task1); // start task1
        executorService.execute(task2); // start task2
        executorService.execute(task3); // start task3

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }

} // end class TaskExecutor

class PrintTask implements Runnable{

    private final static SecureRandom generator = new SecureRandom();
    private final int sleepTime;  // random sleep time for thread
    private final String taskName; // name of task

    // constructor
    public PrintTask(String taskName){

        this.taskName = taskName;

        // pick random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000); // milliseconds
    }

    // method run contains the code that a thread will execute
    //
    // NOTE:
    // because the run() method is not allowed to have throws claws, every single type of checked exception that is a
    // possibility in the body of that run method must be caught.
    // considered best practice, to let the thread itself that's executing the task catch and deal with that exception.
    public void run(){

        try { // put thread to sleep for sleepTime amount of time
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);

            // NOTE:
            // soon as you tell go to sleep, then thread looses the processor, when that sleep time eventually expires,
            // the thread returns to runnable state
            // at which point, the thread scheduling mechanism of the underlying operating system can reschedule that
            // thread to continue executing on a processor
            Thread.sleep(sleepTime); // put thread to sleep
        }

        // we must catch interrupted exception, and to print stack trace if we get it.
        catch (InterruptedException exception){

            exception.printStackTrace();
            Thread.currentThread().interrupt();  // re-interrupt the thread
        }

        // print task name
        System.out.printf("%s done sleeping%n", taskName);
    }

} // end class PrintTask


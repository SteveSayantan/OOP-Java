package Code.MultiThreading;

public class Thread_Intro_CWH {
    /* 
        Learn the difference b/w concurrency and parallelism (Refer to https://medium.com/@itIsMadhavan/concurrency-vs-parallelism-a-brief-review-b337c8dac350 and https://stackoverflow.com/questions/1050222/what-is-the-difference-between-concurrency-and-parallelism)

        A system is said to be concurrent if it can support two or more actions in progress (may not be executed) at the same time (by switching b/w tasks, but doing a single task at any instance) 

        A system is said to be parallel if it can support two or more actions executing simultaneously (using multiple processors)

        Multithreading is used to achieve concurrency

        There are two ways to create threads in java 
         1. By Extending the Thread class
         2. By Implementing the Runnable Interface

        
    */
    public static void main(String[] args) {
        
        // For the extended class, create an object of the child class  
        ExtendedThread thread1= new ExtendedThread();
        
        
        // For the implemented class, create an object of the implemented class and pass that as an arg to the Thread constructor
        ImplementedThread demo= new ImplementedThread();
        Thread thread2= new Thread(demo);        // we can also pass a string as a second arg or use setName() method (on 'thread2') to give a name to this thread
        


        // now, calling the start() on both of the objects (Both of these will run concurrently)
        thread1.start();
        thread2.start();



    }

}

class ExtendedThread extends Thread{    // creating a class extending the Thread class

    // Inside this, we need to override the run method present in Thread class

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Extended Thread is running" +" "+"Thread id is"+" "+this.getId());  // getId() returns the id of that thread, getName() returns the name of the thread
        }
        
    }   

}

class ImplementedThread implements Runnable{    // creating a class implementing the Runnable interface

    // Inside this, we need to override the run method present in Runnable interface

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Implemented Thread is running");
        }
        
    }   

}

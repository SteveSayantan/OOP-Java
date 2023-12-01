package Code.MultiThreading;

public class ThreadPriorities_CWH {
    public static void main(String[] args) {
        /* 
            we can manually set the priority of a particular thread in java. JVM defines a range of 10 logical priorities for Java Threads, including:

            java.lang.Thread.MIN_PRIORITY=1
            java.lang.Thread.NORM_PRIORITY=5 (default priority)   
            java.lang.Thread.MAX_PRIORITY=10

        */

        // creating instance of threads
        ImplementedThread demo= new ImplementedThread();
        Thread thread1= new Thread(demo);
        
        ExtendedThread thread2= new ExtendedThread();

        // setting their priority
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);

        // calling them
        thread1.start();
        thread2.start();

        // not working as expected !!
    }
}







package Code.Exception_Handling;

public class ExceptionHandling_Intro {
    public static void main(String[] args) {
        /* 
            An unexpected unwanted event that disturbs normal flow of the program is called exception. 
             Ex. sleepingException, fileNotFoundException etc.

            It is highly recommended we handle exceptions and the main objective of exception handling is graceful termination of the program.

            Exception handling doesn't mean repairing an exception. We have to provide alternaive way to continue rest of the program normally, it is the concept of Exception handling.
             e.g. Our programming requirement is to read data from remote file located at London, at runtime if London file is not available, our program should not be terminated abnormally. We
             have to provide some local file to continue the rest of the program normally. This way of defining alternative is nothing but Exception Handling.

            Run-time Stack Mechanism
            ------------------------
            For every thread JVM will create a runtime stack. Each and every method call performed by that thread will be stored in the corresponding stack. Each entry in the stack is called stack frame or activation record.

            After completing every method call the corresponding entry from the stack will be removed. After completing all method calls the stack will become empty and that empty stack will be destroyed by JVM
             just before terminating the thread.
            
            While executing a class, after the stack has been created (for the main Thread), the main() method of that class enters the stack. After the main() has been executed,
             it leaves the stack.
         */
    }
}

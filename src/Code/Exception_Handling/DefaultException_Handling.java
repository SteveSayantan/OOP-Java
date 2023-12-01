package Code.Exception_Handling;

public class DefaultException_Handling {
    /* 
        If any exception occurs inside a method, that method is responsible to create exception object by including the following information:

         1. Name of Exception

         2. Description of Exception

         3. Location at which Exception occurs [ Stack Trace]

        After creating exception object, that method hands over that object to the JVM.

        JVM will check whether the method contains any exception handling code . If the method doesn't contain exception handling code, JVM terminates that method abnormally,
         and removes the corresponding entry from the stack.

        Then JVM indentifies caller method and checks whether caller method contains any handling code or not.

        If the caller method doesn't contain handling code, then JVM terminates that caller method abnormally and removes corresponding entry from the stack.

        This process will be continued until main method. If the main method also doesn't contain handling code then JVM terminates main method also abnormally and removes corresponding 
         entry from the stack.

        Then JVM hands over responsibility of exception handling to Default Exception Handler, which is the part of JVM. Default Exception Handler prints exception info in the following manner and terminates program abnormally.

            Exception in thread 'xxx' <Name of the Exception> : Description

             [Stack Trace]

        Example:
        --------
         class Test{

            public static void main(String[] args){
                doStuff();
            }

            public static void doStuff(String[] args){
                doMoreStuff();
            }
            public static void doMoreStuff(String[] args){
                System.out.println(10/0);
            }
         }

         We get the exception as follows:
          
         Exception in thread "main" java.lang.ArithmeticException : / by zero
         at Test.doMoreStuff()
         at Test.doStuff()
         at Test.main()

        Example 2:
        --------
         class Test{

            public static void main(String[] args){
                doStuff();
                System.out.println(10/0);
            }

            public static void doStuff(String[] args){
                doMoreStuff();
                System.out.println("Hii");
            }
            public static void doMoreStuff(String[] args){
                System.out.println("Hello");
            }
         }

         Here we shall see on the console:

         Hello
         Hii
         Exception in thread "main" java.lang.ArithmeticException : / by zero
          at Test.main()

        Note: In a program if at least one method terminates abnormally, then the program termination is abnormal termination. If all methods are terminated nomrally,
         then only program termination is nomal termination.

        Exception Hierarchy:
        --------------------
        Throwable class acts as root for Java Exception Hierarchy. Throwable class defines two child classes Exception and Error.

        Exception:
        -----------
        In most cases, exceptions are caused by our program and these are recoverable.

         e.g. if our programming requirement is to read data from a remote file located at London,
         at runtime, if remote file is not available then we shall get FileNotFound Exception. In such case we can provide local file and continue rest of the program normally.

        Error:
        -----
        Most of the times errors are not caused by our program and these are due to lack of system resources. Errors are non-recoverable.

         e.g. If OutOfMemoryError occurs, being a programmer we can't do anything and the program will be terminated abnormally. Sys-admin or server-admin is responsible to increase heap
         memory.

        Child classes of Exception:
        --------------------------
        1. RunTimeException
        2. IOException
        3. ServletException
        4. RemoteException
        5. InterruptedException etc.
        
        RunTimeException also has some child classes:

        1. ArithmeticException
        
        2. NullPointerException
        
        3. ClassCastException
        
        4. IndexOutOfBoundException
            i. ArrayIndexOutOfBoundException
            ii. StringIndexOutOfBoundException
            
        5. IllegalArgumentException
            i. NumberFormatException
            
        IOException also has some child classes:

        1. EOFException
        
        2. FileNotFoundException
        
        3. InterruptedIOException
        
        Child classes of Error:
        -----------------------
        
        1. VMError
            i. StackOverFlowError
            ii. OutOfMemoryError

        2. AssertionError

        3. ExceptionInInitializerError etc.
            
        
     */
}

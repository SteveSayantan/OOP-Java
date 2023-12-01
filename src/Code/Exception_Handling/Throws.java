package Code.Exception_Handling;

public class Throws {
    public static void main(String[] args) {
        
        /* 
            throws keyword
            --------------
            In our program, if there is a possibility of occurence of checked exception then compulsorily we should handle that. Otherwise, we shall get compile-time error.

            Example 1:  
            ----------

            import java.io.*;

            class Test{
                public static void main(String[] args){
                    PrintWriter pw = new PrintWriter("abc.txt");
                    pw.println("Hello");    
                }
            }
            Compile-time Error: Unreported exception java.io.FileNotFoundException;

            Example 2:  
            ----------

            class Test{
                public static void main(String[] args){
                    Thread.sleep(10000);    
                }
            }
            Compile-time Error: Unreported exception java.io.InterruptedException;

            We can handle these CE by the following two ways:

            1. Using try-catch
            -------------------
            class Test{
                public static void main(String[] args){
                    try{
                        Thread.sleep(10000);    
                    }
                    catch (InterruptedException e){
                        // catch block can be empty also
                    }
                }
            }

            2. Using throws keyword
            ------------------------

            We can use 'throws' keyword to delegate the responsibility of Exception handling to the caller ( it may be another method or JVM). Then caller method is responsible
             to handle that exception.

            class Test{
                public static void main(String[] args) throws InterruptedException      // delegating the responsibility of Exception handling to the JVM (since, JVM calls the main() )
                {
                    Thread.sleep(10000);    
                }
            }

            "Throws" keyword required only for checked exceptions. Usage of 'throws' for unchecked exceptions yields no impact.

            "Throws" keyword is required only to convince compiler. Usage of it doesn't prevent abnormal termination of the program.

            class Test{
                public static void main(String[] args) throws InterruptedException {    // using 'throws', we're delegating the task of exception (which might occur at line 68) handling to the caller i.e. JVM
                    doStuff();
                }
                public static void doStuff() throws InterruptedException{ // using 'throws', we're delegating the task of exception (which might occur at line 71) handling to the caller i.e. main()
                    doMoreStuff();
                }
                public static void doMoreStuff() throws InterruptedException{   // using 'throws', we're delegating the task of exception (which might occur at line 74) handling to the caller i.e. doStuff()
                    Thread.sleep(10000);
                }

            }

            In the above program, if we remove at least one 'throws' statement, the code won't compile. 

            Note: It is recommended to use try-catch over throws keyword.

            Case 1:
            ------
            We can use 'throws' keyword for methods and constructors but not for classes.

            class Test throws Exception{    // invalid, as class is never called, class members are called

                Test() throws Exception{    // valid

                }

                public void m1() throws Exception{  // valid

                }
            }

            Case 2:
            -------
            We can use 'throws' keyword only for throwable types, if we are trying to use for normal java classes, then we shall get Compile-time Error.

            class Test {
                public static void main(String[] args) throws Test {    // gives CE
                    
                }
            }

            class Test extends RuntimeException {
                public static void main(String[] args) throws Test {    // valid
                    
                }
            }

            Case 3:
            ------
            class Test{

                public static void main(String[] args){    // Gives CE, as Exception() is a checked exception and our main method does not handles it ( either using try-catch or 'throws' keyword ).
                    throw new Exception();  
                }
            }

            class Test{

                public static void main(String[] args){    // compiles fine, as Error() is unchecked exception (hence compiler doesn't care whether it is being handled or not)

                    throw new Error();   // but in runtime, default exception handler terminates this program abnormally   
                }
            }

            Case 4:
            ------
            In our program, inside the try block, if there is no chance of rising an exception then we can't write catch block for that exception otherwise, we shall get compile-time error. But this rule 
             is applicable only for fully-checked exceptions.

            Ex 1:
            class Test{

                public static void main(String[] args){    // compiles fine, as ArithmeticException is unchecked exception
                    try{
                        System.out.println("Hello");
                    }
                    catch (ArithmeticException e){

                    }
                }
            }
            Ex 2:
            class Test{

                public static void main(String[] args){    // compiles fine, as Exception is partially-checked exception
                    try{
                        System.out.println("Hello");
                    }
                    catch (Exception e){

                    }
                }
            }
            Ex 3:
            class Test{

                public static void main(String[] args){    // gives CE, as there is no chance of occurrence of IOException (fully-checked) in the try block
                    try{
                        System.out.println("Hello");
                    }
                    catch (java.io.IOException e){

                    }
                }
            }

            Ex 4:
            class Test{

                public static void main(String[] args){    // gives CE, as there is no chance of occurrence of InterruptedException (fully-checked) in the try block
                    try{
                        System.out.println("Hello");
                    }
                    catch (java.lang.InterruptedException e){

                    }
                }
            }

            Ex 5:
            class Test{

                public static void main(String[] args){    // compiles fine, as Error is an unchecked exception
                    try{
                        System.out.println("Hello");
                    }
                    catch (Error e){

                    }
                }
            }
            */
        }
    }

package Code.Exception_Handling;

public class CustomizedExceptionHandling {
    /* 
        Customized Exception Handling
        -----------------------------
        It is highly recommended to handle exceptions. The code which may rise an exception is called risky code. We should define that code inside try block. 
        Corresponding handling code we have to define inside catch block.

        try{
            // risky code
        }
        catch (Exception e){
            // handling code
        }

        Without try-catch
        -----------------

        class Test{
            public static void main(String[] args) {
                System.out.println("statement:1");
                System.out.println(10/0);
                System.out.println("statement:3");
            }
        }
        // Abnormal Termination

        With try-catch
        ---------------

        class Test{
            public static void main(String[] args) {
                System.out.println("statement:1");
                try{
    
                    System.out.println(10/0);
                }
                catch(Exception e){
                    System.out.println(10/2);
                }
                System.out.println("statement:3");
            }
        }
        // Normal Termination

        Control-flow in try-catch
        -------------------------

        Consider the following code:
        try{
            statement 1;
            statement 2;
            statement 3;
        }
        catch(Exception e){
            statement 4;
        }

        statement 5;

        Case 1: If no exception occurs, the sequence of execution will be 1,2,3,5 then Normal Termination

        Case 2: If an exception occurred at statement 2 and the corresponding catch block matched, the sequence of execution will be 1,4,5 then Normal Termination 

        Case 3: If an exception occurred at statement 2 and the corresponding catch block did not match, the sequence of execution will be 1 then Abnormal Termination 

        Case 4: If an exception occurred at statement 4 or statement 5 then it is always Abnormal Termination 

        Note: Within the try block, if anywhere an exception occurs the rest of the try block won't be executed even though we handled the exception. Hence within the try block we have to take only risky code and length
         of try block should be as less as possible.
         
        Note: In addition to try block, exception may occur inside catch and finally blocks.
        
        Note: If any statement which is not a part of try block causes an exception then it is always abnormal termination.

        Methods to print Exception Information:
        --------------------------------------

        Throwable class defines the following methods to print Exception information.

        printStackTrace() --> Name of Exception: Description, Stack Trace

        toString() --> Name of Exception: Description

        getMessage() --> Description

        Example:
        -------
        class Test{
            public static void main(String[] args) {
                try {

                    System.out.println(10/0);

                } catch (ArithmeticException e) {
    
                    e.printStackTrace();        // java.lang.AE: / by zero at Test.main()
    
                    System.out.println(e);      // java.lang.AE: / by zero 
    
                    System.out.println(e.getMessage()); // / by zero 
                }
            }
        }

        Internally, default Exception handler will use printStackTrace() to print exception info to the console. 

        Try with multiple Catch block:
        ------------------------------
        The way of handling an exception is varied from exception to exception. Hence, for every exception type it is highly recommended to take separate catch block i.e. try with multiple catch block is 
         always possible and recommended to use. 

        Worst Approach
        --------------

        try{
            // risky code
        }
        catch( Exception e){    // All errors are handled by this catch block

        }

        Best Approach
        --------------

        try{
            // risky code
        }
        catch( ArithmeticException e){    
            // perform alternative arithmetic operations
        }
        catch( SQLException e){    
            // use mySQL instead of Oracle db
        }
        catch( FileNotFoundException e){    
            // Use local file instead of remote file
        }
        catch( Exception e){    
            // default exception handling
        }

        If try with multiple catch blocks is present, the order of catch blocks is very important. We have to take child first, followed by parent, otherwise we shall get Compile-time error.

        try{
            // risky code
        }
        catch (Exception e){

        }
        catch(ArithmeticException e){   // gives Compile-time error

        }

        We can't declare two catch blocks for the same exception otherwise we shall get compile-time error.
        */
    }



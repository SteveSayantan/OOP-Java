package Code.Exception_Handling;

public class Checked_UncheckedException {
    /* 
        Checked vs Unchecked Exceptions:
        --------------------------------

        The exceptions that are checked by compiler for smooth execution of the program are called checked exceptions.
         Ex. AdmitCardMissingException, PenNotWorkingException, FileNotFoundException etc.

        Basically, checked exceptions are some common issues that might occur while execution. Compiler checks whether our program has the capability to handle such situations. In our program, if there is a chance of occurence of checked exception,
         we should compulsorily handle that checked exception (either by try-catch or by throws keyword). Otherwise, we shall get compile time error.


        The exceptions that are not checked by compiler whether being handled or not by the programmer, such exceptions are called Unchecked exceptions.
         Ex. ArithmeticException, BombBlastException etc.

        Unchecked Exceptions are unlikely to occur hence they are not checked by the compiler.

        Note: Whether it is checked or unchecked, every exception occurs at run-time only. There is no chance of occuring any exception at compile-time. 

        Note: RuntimeException and its child classes, Error and its child classes are unchecked. Except these, remaining are checked.

        Fully-Checked vs Partially-Checked
        ----------------------------------
        A checked exception is said to be fully-checked iff all its child classes are also checked. Ex. IOException, InterruptedException

        A checked exception is said to be partially-checked iff some of its child classes are unchecked. Ex. Exception, Throwable

        Note: The only possible partially-checked exceptions in Java are: Exception, Throwable.

        Describe the behavior of following exceptions:
        ----------------------------------------------

        1. IOException              --> Checked (Fully)
        2. RuntimeException         --> Unchecked
        3. InterruptedException     --> Checked (Fully)
        4. Error                    --> Unchecked
        5. Throwable                --> Checked (Partially)
        6. ArithmeticException      --> Unchecked
        7. NullPointerException     --> Unchecked
        8. Exception                --> Checked (Partially)
        9. FileNotFoundException    --> Checked (Fully)
     */
}

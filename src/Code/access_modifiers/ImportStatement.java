package Code.access_modifiers;


public class ImportStatement {
    /* 
        There are two types of import statements:

         1. Explicit class import (e.g. import java.util.ArrayList)

         2. Implicit class import (e.g. import java.util.*)  // not recommended at all


        Examples of invalid import statements:
        -------------------------------------- 
         import java.util.ArrayList.* ;     // invalid as no class is present inside ArrayList class 
         import java.util;     // invalid as putting ; after package name is not valid, a class or '.*' must be present 

        If we use fully qualified name we need not use import statement, and the vice-versa is also true.

        Multiple packages having same class
        ------------------------------

         import java.util.*; 
         import java.sql.*; 

         class Test{
            public static void main(String[] args){
                Date d = new Date();        // gives compile-time error as Date is present in util and sql both
            }
         }

        While resolving class names, compiler will always give precedence in the following order:

         1. Explicit class import
         2. Classes present in present working dir (default package)
         3. Implicit class import

        Example of Precedence
        ---------------------
         import java.util.Date; 
         import java.sql.*; 

         class Test{
            public static void main(String[] args){
                Date d = new Date();    // Date class from util package got considered (explicit import)     
            }
         
         }

        Accessing Subpackage Classes:
        ----------------------------

         Whenever we are importing a java package, all classes and interfaces present in the package by default are available.
         But not subpackage classes. If we want to use subpackage class, we have to write import statement until subpackage level.

         Ex.

         java (package)
          |- util  (package)
              |- regex  (package)
                  |- Pattern  (class)

         To use Pattern class, we need to use -> import java.util.regex.* ;
        

        Default available class
        ----------------------
        All classes and interfaces present in the following packages are by default available to every java program, hence we need not write
         import statements

         1. java.lang package
         2. default package (current working dir)


        # Import statement is totally compile time related concept. More number of imports take more compile time but there is no effect on execution
         time (run-time).
         
        Difference b/w C language #include and Java import statement.
        --------------------------------------------------------------

         In case of #include all header files will be loaded at the beginning. Hence it is static include.

         In the case of java.import statement, no .class file will be loaded at the beginning, whenever we are using a particular class, then only corresponding
          .class file will be loaded. This is considered as Dynamic include.

        Explain about System.out.println()
        ----------------------------------

         System --> is a class present in java.lang package

         out --> is a static variable of type PrintStream present in System class.

         println() --> is a method present in printStream class. 
     */
}

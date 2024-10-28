package Demo;

public class Package_Intro {
    /* 
        Package
        --------
        It is an encapsulation mechanism to group related classes and interfaces into a single unit i.e. a package.
         Ex.
          All classes and interfaces required for db operations are grouped into a single package i.e. java.sql package.

        Advantages:
        -----------
         1. To resolve naming conflicts i.e. unique identification of our components

         2. Improves modularity of the application

         3. Improves maintainability of the application

         4. It provides security for our components.

        Naming Convention
        -----------------
        There is one universally accepted naming convention for packages i.e. to use internet domain name in reverse.
         Ex.
          com.icicibank.loan.housing.Account

          com.icicibank --> client's internet domain name in reverse
          loan --> module name
          housing --> sub-module name
          Account --> class name

        Creating package
        ----------------

        Consider the following folder structure:

         current_dir(pwd)
            |- com (folder)
                |- steve (folder)
                    |- oop (folder)
                        |- src (folder)
                            |- Test.java (source code)
                        |- bin (folder)

         Test.java
         ---------
           package com.steve.oop.bin;      // as we want to keep the generated .class file inside bin folder

           public class Test{

                public static void main(String[] args){

                    System.out.println("pkg demo");
                }
           }

        If we run `javac com/steve/oop/Test.java` (inside current_dir), the code will compile fine, but the generated .class file will be placed
         inside the same folder containing the source code.

                src
                |- Test.java
                |- Test.class

        To place the .class file in the corresponding package structure, we need to run `javac -d . com/steve/oop/src/Test.java` (inside current_dir) .
        
        Now, the generated .class file will be placed inside folder 'oop' . ` -d ` flag denotes destination to place generated .class files and `.` represents current_dir (pwd) . 

                current_dir(pwd)
                    |- com (folder)
                        |- steve (folder)
                            |- oop (folder)
                                |- src (folder)
                                    |- Test.java (source code)
                                |- bin (folder)
                                    |- Test.class (byte code)

        
        If the corresponding package structure not available, then this command will create corresponding package structure. 

        As destination, instead of `.` , we can provide any valid directory path. But the corresponding package structure will be created inside that directory
         if not available already. E.g., 
         
           `javac -d F: com/steve/oop/src/Test.java` --> This command (executed inside current_dir) will create the package structure in F:, and place the .class file accordingly.

                F:
                |- com (folder)
                    |- steve (folder)
                        |- oop (folder)
                            |- src (folder)
                                |- Test.java (source code)
                            |- bin (folder)
                                |- Test.class (byte code)

        If the specified directory (destination) is not already available itself, then we will get compile-time error.   

        # Remember, we have to compile the source code always from the "current_dir" level, otherwise the compiler won't recognise the imported files in the code.

        Now, to execute this Test class, 

           current_dir(pwd)
                |- com (folder)
                    |- steve (folder)
                        |- oop (folder)
                            |- src (folder)
                                |- Test.java (source code)
                            |- bin (folder)
                                |- Test.class (byte code)
        
        We need to run the follwing command with fully qualified name -->  `java com.steve.oop.bin.Test` (must be run inside current_dir itself) .
         This fully qualified name has to be used while importing this class in another file also.
        
        
        Conclusion: 
          
           In a java source program, there can be
           
            package statement -> at most one

            import statement -> any number

            class/interface/enum declaration -> any number

          This order must be maintained, otherwise we will get compile time error.
        
          Remember, an empty java source file is also a valid java program.

    */
}

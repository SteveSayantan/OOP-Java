package Code.access_modifiers;

public class FileStructure {
    /* 
        Java Source File Structure:
        ---------------------------

        A java program can contain any number of classes but at most one class can be declared as public. If there is a public class,name of
         the program and the name of the public class must match. Otherwise, we will get compile time error.

        If there is no public class, we can provide any name to the file.

        Consider the following code:

            Test.java
            ----------
                class A{
                    public static void main(String[] args){
                        System.out.println("A class main");
                    }
                }
                class B{
                    public static void main(String[] args){
                        System.out.println("B class main");
                    }
                }
                class C{
                    public static void main(String[] args){
                        System.out.println("C class main");
                    }
                }
                class D{
                
                }

        When we compile this program file by `javac Test.java` , 4 class files are generated 

            A.class
            B.class
            C.class
            D.class

        `Java A` gives o/p : "A class main"

        `Java B` gives o/p : "B class main"

        `Java C` gives o/p : "C class main"

        `Java D` gives Run-time error, as there is no main method

        `Java Test` gives Run-time error, as there is no .class file named Test

        Conclusion
        ----------
        1. Whenever we are compiling a java program, for every class present in the program a separate .class file will be generated.

        2. We can compile a java program (java source file), but we can run a java .class file.

        3. Whenever we are executing a java class, the corresponding main method will be executed.

        4. However, it is not recommended to write multiple classes inside a file.

        Import Statement:
        ----------------

         class Test{

            public static void main(String[] args){
                ArrayList l= new ArrayList();
            }
         }

        The above code gives compile time error. This can be solved by using fully qualified name:
          
            java.util.ArrayList l= new java.util.ArrayList();   // java.util.ArrayList is the fully qualified name

        However, using fully qualified name everytime is a pain, we can solve this problem using import statement. Whenever we are typing import
         statement, it is not required to use fully qualified name, we can use short name directly.

         import java.util.ArrayList;

         class Test{

            public static void main(String[] args){
                ArrayList l= new ArrayList();       // Arraylist is the short name
            }
         }

        Hence, import statement works as typing shortcut.
     */
}

package Code.static_Nonstatic;

import static Demo.Package_Example.message;

public class Package_intro {
    

    public static void main(String[] args) {

        message();          // This method is located in Package_Example.java class which lies in a different dir. So we need an import statement. 

        Human steve= new Human(23, "Sayantan", 100); // Importing Human class. No import statement required as it is in the same dir.
        // steve.isLoyal;           // false  
        // steve.increment;         //1
        // Human.population         //1             We should use the classname to access or modify static variables

        Human random= new Human(25, "Andrew", 1000);
        // random.increment;        //1
        // Human.population         //2



        /*  
            // Refer to Human.java for related examples-->
            --------------------------------------------

            When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
            i.e., even if we do not create any instance of Human class, the static things can still be accessed or modified.

            You can declare both methods and variables to be static. The most common example of a static method is main( ).

            Why main() is declared as static?
            ---------------------------------

            - Whenever we run a Java program, main() has to be executed first, w/o main() the program itself can't run.

            - Therefore, if main() is not declared as static, we have to create an instance of the parent class to access main(). As non-static properties or methods
                can't be accessed without creating an object of that class.
            
            - But, we won't be able to run the program itself in the first place w/o access to main(). Hence, no question of creating an object (before executing main()) from that class arises.

            - So, we should be able to run main() without creating an object of the class it belongs to. Hence, it is static.

            # We can not access anything non-static inside a static method. As non-static methods or properties belong to an object,
                therefore, accessing those without specifying the object in which they belong, like we do in case of static things, is not possible. 

                In simple terms, in a static context, you don't have an instance, that's why you can't access a non-static member without explicitly mentioning an object reference.

                But, the vice-versa is possible.

            ## However, if we want to access non-static stuff inside static context, we need to create an instance inside the static context.

            # A static method cannot refer to "this" or "super" keywords in anyway

            # As static stuff does not depend on object and objects are created during run time, the static level things are resolved during compile time.

            

        */
        

            

        
    }
}

/* 
    Package:
    ---------
    Packages are containers (or folders) for classes (Every file in Java is a class). They are used to keep the classes in a compartmentalized way.
    For example, a package allows you to create a class named List, which you can store in your own package without concern that it will collide with some other class named List stored elsewhere.

    Packages are stored in a hierarchical manner .

    e.g.: 
        1. Code/ is the package for this class Package_intro.java

        2. a package name `com.Steve.Something` simply refers to this structure --> com/Steve/Something/

        3. If we create project for a company 'XYZ.com', the package name starts with `com.XYZ. ...`  (convention)

        4. The hierarchy indicated by the package name, must be reflected properly in our actual folder structure too.

    How does the Java run-time system know where to look for packages that we create? The answer has three parts.

        - First, by default, the Java run-time system uses the current working directory as its starting point. Thus, if your package is in a subdirectory of the current directory, it will be found.

        - Second, you can specify a directory path or paths by setting the CLASSPATH environmental variable. Checkout .vscode dir.

        - Third, you can use the -classpath option with java and javac to specify the path to your classes.   

    When a package is imported, only those items within the package declared as public will be available to non-subclasses (classes outside its package).
 */

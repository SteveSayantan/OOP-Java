package Code;
// Go through classes.md in Theory for more details

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        Student student1;       // This is called the declaration part, 'student1' is the reference variable in stack (allocated at compile time)

        // before initialization, all the reference variables of 'Student' class will point to null.  At this point if we try to access any property or method, it will throw nullPointerException.

        Student[] list= new Student[3];     // Here, each index will contain reference to an instance of 'Student' class
        System.out.println(Arrays.toString(list));  // [null, null, null]         As the instances are not initialized yet. 

        student1= new Student();    // Initialization of object (allocated at run time)

        // At this point, our object does not have the following properties in it, therefore we get the default values if we try to access those
        
        // student1.name;          // null (as the object of class String has not been initialized yet, so it returns the default value)
        // student1.rNo;           //0 
        // student1.marks;         // 90.0 (default value provided while creating Student class)

        // Modifying the object
        student1.name="Steve";
        student1.marks=92;
        student1.rNo=34;
        // student1.salary=50000;       // Gives an error as 'salary ' is not present in Student class, due to the static-typed nature of Java


        
    }
}

// This is how we create class. Name of every class must start with an uppercase.
class Student{ 
     
    int rNo;            // 0 (by default)
    String name;        // null (by default)
    float marks =90f;   // 90.0 (we can also provide default values like this)
}
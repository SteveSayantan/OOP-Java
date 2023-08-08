package Code.OOP_Principles.Polymorphism;

/* 
    Poly --> many
    Morphism --> ways to represent

    It means act of representing same thing in different way.

    A language that does not support Polymorphism, is called Object-Basis Language. e.g. Ada

    A language that supports Polymorphism, is called Object-Oriented Language.

    Polymorphism and overriding does not apply to instance variables.
    
    Reference: https://youtu.be/MYzaDgNGmTg (Durga Java)

 */
public class Polymorphism_Example {
    
    public static void main(String[] args) {

        
        /* 
        Types of Polymorphism:
        ----------------------
        
        1. Compile Time / Static Polymorphism / Early Binding : Achieved by method overloading i.e. functions with same name but different args .
        e.g. creating multiple Constructors in a class i.e. Constructor Overloading.

            It is called 'Static Polymorphism' because which method has to be called is decided at compile time
        
        2. Dynamic / Runtime Polymorphism / Late Binding : It is achieved by method overriding.
                
        */       
        
        // Shapes has 'area()' method, which is overridden in Circle, Square
        Shapes obj = new Shapes();
        Circle circle = new Circle();
        Shapes random = new Square();

        obj.area();     // Area is the space occupied (i.e. parent method executed, because Object type is parent i.e. Shape)
        circle.area();  // Area is 3.14 * r * r       (i.e. child method executed, because Object type is child i.e. Circle)


        random.area();      //Area is square of a side (i.e. child method executed, because Object type is child i.e. Square)

        /* 
            Explanation:
            -----------
            When parent-type reference (i.e. random ) holds child object (i.e. Square), we can only call parent methods using that reference.

            While calling 'area()' using parent-type reference:

            - Now, compiler will check if 'area()' is defined on 'Shapes' . It is there, hence no compilation error.
                But if there is no 'area()' defined in Shape, it will throw error during compile time.

            - In run time, JVM detects this parent reference pointing to child object. Now, JVM further checks if this method 
                is overridden in child or not . If yes, then child class method is executed. Otherwise, parent method is executed. This particular process is Dynamic Method Dispatch.

                Hence, we can say, in overriding, method resolution (parent or child class method to be executed ) is based on the ** runtime Object type ** 
                and not on reference var. type.

            This is an example of Runtime Polymorphism.
        */

        random.message();       // This can't be overridden either (i.e. not overrided)

    }


}

// class Random extends FinalClass{}    // Gives error as FinalClass can't be inherited


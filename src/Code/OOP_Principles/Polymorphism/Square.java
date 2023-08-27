package Code.OOP_Principles.Polymorphism;

public class Square extends Shapes{
    
    @Override   // This is an annotation
    void area(){
        System.out.println("Area is square of a side");
    }

    // @Override        
    static void message(){    // This  will not override the message() present in Shapes class 

        System.out.println("It is trying to override static method");
    } 

    /* 
        Rules for Overriding:
        --------------------
        1. 
     */
}

package Code.OOP_Principles.Polymorphism;

public class Circle extends Shapes{
    

    @Override   // This is an annotation
    void area(){
        System.out.println("Area is 3.14 * r * r");
    }
}

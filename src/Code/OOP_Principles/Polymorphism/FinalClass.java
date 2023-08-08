package Code.OOP_Principles.Polymorphism;

public final class FinalClass {  // Declaring a class as final, prevents it from being inherited by some other class
    

    void printMessage(){        // All the methods inside a final class, also becomes final i.e. can't be overridden
        System.out.println("This method is also final");
    }
}

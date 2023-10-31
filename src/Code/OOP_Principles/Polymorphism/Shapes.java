package Code.OOP_Principles.Polymorphism;

public class Shapes {
    
    // static int sum(int a,int b){
    //     return a+b;
    // }

    static double sum(double a,int b){
        return a+b;
    }
    void area(){
        System.out.println("Area is the space occupied");
    }

    final void greeting(){      // Any method declared as 'final' can't be overridden
        System.out.println("This can't be overridden");
    }

    // Any static method can't be overridden but inherited , check Square.java . This is because, static method does not depend on object, it always runs from the parent class.
    static void message(){      
        System.out.println("This can't be overridden either");
    }

    public static void main(String[] args) {
        
        // Even if we are passing integers, Java will automatically cast those into Doubles, as no other function is defined there to accept two integers.

        sum(3, 4);      

        // However, had sum(int a,int b) been present, then Java would call it, instead of calling sum(double a,int b) .

    }

}

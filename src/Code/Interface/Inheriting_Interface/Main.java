package Code.Interface.Inheriting_Interface;

public class Main implements Interface_B {

    // Since Interface_B extends Interface_A, we have to override the inherited methods as well
    @Override
    public void greet() {
        System.out.println("Hello there");
        
    }

    @Override
    public void fun() {
        System.out.println("Have fun");
        
    }
    
}

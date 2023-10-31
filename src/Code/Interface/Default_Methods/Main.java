package Code.Interface.Default_Methods;

public class Main implements Interface_Neptune,Interface_Venus{

    /* 
    We don't need to override default methods present in an interface. The default methods are provided to expand the Interface w/o breaking the existing code.
        So that, new methods can be added to an interface without the need of implementing their body.

    Interface_Neptune and Interface_Venus, when they are being implemented simultaneously in a class, can not contain duplicate default methods . 
    */
    @Override
    public void revolve() {
        System.out.println("Revolve around the sun");
        sayName();  // we can use that default method like this
        sayHello();
        
    }
    
    public static void main(String[] args) {
        
    }
}

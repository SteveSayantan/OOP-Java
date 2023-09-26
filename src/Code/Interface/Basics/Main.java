package Code.Interface.Basics;

public class Main {
    public static void main(String[] args) {

        Car gaddi= new Car();
        gaddi.start();
        gaddi.acc();
        
        
        Interface_Engine v8=new Car();  // We can also use Interface_type  variables to hold child_class object reference
        // v8.speedLimit                // But it can not access child_class properties

        // start from 46:10 of lec-5, state the problem with current approach

        // make the separate classes within a new dir
    }

    
}

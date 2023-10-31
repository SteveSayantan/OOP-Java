package Code.Interface.Basics;

import Code.access_modifiers.Interface_Music;

public class Main {
    public static void main(String[] args) {

        Car gaddi= new Car();        
        gaddi.start();      // Starting Car               
        gaddi.acc();
        
        
        Interface_Engine v8=new Car();  // We can also use Interface_type  variables to hold child_class object reference
        // v8.speedLimit                // But it can not access child_class specific properties

        v8.stop();                      // Powering off Car (As it has been overridden )


        /*  
            Problems with current approach
            -------------------------------       
            As shown below, if there are two methods with the same name, we can not override and use both with this approach. 
            Therefore, we have to create separate classes from each interface.

        */
        Interface_Music musicPlayer= new Car();
        musicPlayer.start();  // Starting Car          (But we can not use the start() present inside Interface_Music)

        
    }

    
}

package Code.Interface.Basics;

import Code.access_modifiers.Interface_Brake;

public class Car implements Interface_Brake,Interface_Engine {  // We can use implements keyword to inherit multiple interfaces
    int speedLimit=100;
    @Override
    public void brake() {
        System.out.println("Brake pressed, Slowing down Car");
        
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Car");
        
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
        
    }

    @Override
    public void stop() {
        System.out.println("Powering off Car");
        
    }
    
}

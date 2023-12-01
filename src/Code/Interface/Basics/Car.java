package Code.Interface.Basics;

import Demo.Interface_Music;

public class Car implements Interface_Music,Interface_Engine {  // We can use implements keyword to inherit multiple interfaces
    int speedLimit=100;

    // The class implementing the interface have to override each and every method received from the interface
    @Override
    public void pause() {
        System.out.println("Pause the music");
        
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Car");
        
    }

    @Override
    public void start() {   // since, we have already overridden the start method, we can not do the same again (for the start() in Interface_Music)
        System.out.println("Starting Car");
        
    }
    

    @Override
    public void stop() {
        System.out.println("Powering off Car");
        
    }
    
}

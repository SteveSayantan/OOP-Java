package Code.Interface.Separate_Class_Example;

public class DieselEngine implements Interface_Engine {

    @Override
    public void acc() {
        System.out.println("Acclerate the Diesel Car");
        
    }

    @Override
    public void start() {
        System.out.println("Start the Diesel Car");
        
    }

    @Override
    public void stop() {
        System.out.println("Stop the Diesel Car");
        
    }
    
}

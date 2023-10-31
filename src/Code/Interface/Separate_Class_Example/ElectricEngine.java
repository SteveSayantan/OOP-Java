package Code.Interface.Separate_Class_Example;

public class ElectricEngine implements Interface_Engine{

    @Override
    public void acc() {
        System.out.println("Acclerate the Electric Car");
        
    }

    @Override
    public void start() {
        System.out.println("Start the Electric Car");
        
    }

    @Override
    public void stop() {
        System.out.println("Stop the Electric Car");
        
    }


    
}

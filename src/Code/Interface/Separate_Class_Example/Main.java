package Code.Interface.Separate_Class_Example;

public class Main {
    
    public static void main(String[] args) {
        CustomisableCar car1= new CustomisableCar();
        car1.start();       // start the electric car

        CustomisableCar car2= new CustomisableCar(new DieselEngine(), new DigitalMusicPlayer());
        car2.start();       //Start the Diesel Car
        car2.startMusic();  //Start the Digital Player
    }
}

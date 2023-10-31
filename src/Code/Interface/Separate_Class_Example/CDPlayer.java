package Code.Interface.Separate_Class_Example;

public class CDPlayer implements Interface_MusicPlayer {

    @Override
    public void adjustVolume() {
        System.out.println("Adjust the volume of the CD Player");
        
    }

    @Override
    public void pause() {
        System.out.println("Pause the CD Player");
        
    }

    @Override
    public void start() {
        System.out.println("Start the CD Player");
        
    }
    
}

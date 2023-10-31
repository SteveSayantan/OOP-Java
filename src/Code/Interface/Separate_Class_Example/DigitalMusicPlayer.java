package Code.Interface.Separate_Class_Example;

public class DigitalMusicPlayer implements Interface_MusicPlayer {

    @Override
    public void adjustVolume() {
        System.out.println("Adjust the volume of the Digital Player");
        
    }

    @Override
    public void pause() {
        System.out.println("Pause the Digital Player");
        
    }

    @Override
    public void start() {
        System.out.println("Start the Digital Player");
        
    }
    
}

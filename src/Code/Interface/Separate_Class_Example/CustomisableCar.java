package Code.Interface.Separate_Class_Example;

public class CustomisableCar {
    private Interface_Engine engine;
    private Interface_MusicPlayer player;

    public CustomisableCar(){   // start with electric engine and cd player
        engine= new ElectricEngine();
        player= new CDPlayer();
    }

    // Using this constructor, we can supply any type of engine (diesel,electric) and music-player (cd,digital) as per our wish
    public CustomisableCar(Interface_Engine engine,Interface_MusicPlayer player){
        /* 
            We could have used ref variable type ElectricEngine or DieselEngine for the formal parameter 'engine'  but that would restrict our customising
            abilities as in that case we had to pass only a specific type.
            
            But with this setup, we can pass both ElectricEngine or DieselEngine type.
        */
        this.engine=engine;
        this.player=player;
    }

    void start(){
        engine.start();
    }

    void stop(){
        engine.stop();
    }


    void startMusic(){
        player.start();
    }
}

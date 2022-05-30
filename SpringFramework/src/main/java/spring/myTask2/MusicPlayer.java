package spring.myTask2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
    private final Music rapMusic, drillMusic;
    @Autowired
    public MusicPlayer(@Qualifier("rap")Music rapMusic, @Qualifier("drill") Music drillMusic) {
        this.rapMusic = rapMusic;
        this.drillMusic = drillMusic;
    }

    public void playMusic(Genre genre) {
        switch (genre) {
            case RAP:
                System.out.println("Playing: "+ rapMusic.getSong() + " (Genre: RAP)");
                break;
            case DRILL:
                System.out.println("Playing: " + drillMusic.getSong() + " (Genre: DRILL)");
                break;
            default:
                System.out.println("Not apply genre");
        }
    }
}

package spring.javacodeconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    private MusicPlayer musicPlayer;
    @Autowired
    public void Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Tracks " + musicPlayer.playMusic();
    }
}

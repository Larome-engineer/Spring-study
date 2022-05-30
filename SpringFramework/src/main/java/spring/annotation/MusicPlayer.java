package spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
    private final Music music, music1;
    @Value("${musicPlayer.volume}")
    private String volume;
    @Value("${musicPlayer.name}")
    private String name;

    public String getName() {
        return "Author: " + name;
    }

    public String getVolume() {
        return "Volume: " + volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rock") Music music,
                       @Qualifier("classic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() + " & " + music1.getSong();
    }
}

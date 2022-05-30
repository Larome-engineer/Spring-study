package spring.javacodeconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music music, music1;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }


    @Autowired
    public MusicPlayer(@Qualifier("rock")Music music, @Qualifier("classic")Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic() {
        return music.getSong() + "\n" + music1.getSong();
    }
}

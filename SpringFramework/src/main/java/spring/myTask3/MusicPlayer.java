package spring.myTask3;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> musicList;

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public String playMusic(){
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();
    }

}

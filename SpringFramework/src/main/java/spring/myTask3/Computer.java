package spring.myTask3;

public class Computer {

    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}

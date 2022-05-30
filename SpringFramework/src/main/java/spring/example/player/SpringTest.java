package spring.example.player;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appCon.xml");

        DrillMusic drillMusic = context.getBean("musicBean", DrillMusic.class);
        DrillMusic drillMusic1 = context.getBean("musicBean", DrillMusic.class);
        System.out.println(drillMusic1.getSong());
        System.out.println(drillMusic.getSong());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comp = musicPlayer == musicPlayer1;
//        System.out.println(comp);
//        musicPlayer.playMusic();
//        musicPlayer1.setVolume(25);
//        musicPlayer1.playMusic();
//        System.out.println(musicPlayer.getVolume() + " " );
//        System.out.println(musicPlayer1.getVolume() + " ");
        context.close();
    }
}

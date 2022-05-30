package spring.myTask2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContextForTask2.xml"
        );
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Genre.DRILL);
        player.playMusic(Genre.RAP);
        context.close();
    }
}

package spring.myTask;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringTaskTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextForTask.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        context.close();
    }
}

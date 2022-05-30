package spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContextAnnotation.xml");
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + "\n" + musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classic", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        context.close();
    }
}


package spring.myTask3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("spring.myTask3")
public class SpringConfig {
    @Bean
    public DrillMusic drillMusic(){
        return new DrillMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(drillMusic(), rockMusic(), rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}

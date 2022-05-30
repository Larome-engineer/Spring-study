package spring.javacodeconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.javacodeconfig")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}

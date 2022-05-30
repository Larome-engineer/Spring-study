package spring.javacodeconfig;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Teen's like team spirit";
    }
}

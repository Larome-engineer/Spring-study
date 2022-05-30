package spring.annotation;

import org.springframework.stereotype.Component;
@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Teens like team spirit";
    }

}

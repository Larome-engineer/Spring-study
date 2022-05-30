package spring.javacodeconfig;

import org.springframework.stereotype.Component;

@Component("classic")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moon sonata";
    }
}

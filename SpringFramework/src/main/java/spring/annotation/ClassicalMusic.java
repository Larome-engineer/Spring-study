package spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic - Moon Sonata";
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Initialization!");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destruction!");
    }
}

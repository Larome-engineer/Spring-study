package spring.myTask2;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@Component("rap")
public class RapMusic implements Music {
    List<String> rapList = Arrays.asList("Travis Scott - The Plan",
            "Tyga - SWISH", "Doja Cat - Streets");

    @Override
    public String getSong() {
        Random random = new Random();
        int index = random.nextInt(rapList.size());
        return rapList.get(index);
    }
}

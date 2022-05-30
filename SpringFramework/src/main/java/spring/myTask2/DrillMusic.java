package spring.myTask2;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@Component("drill")
public class DrillMusic implements Music{
    List<String> drillList = Arrays.asList("Pop Smoke - Invisible",
            "2Scratch - She Wolf", "Gazo - Drill FR 5");

    @Override
    public String getSong() {
        Random random = new Random();
        int index = random.nextInt(drillList.size());
        return drillList.get(index);
    }
}

package spring.example.player;

public class DrillMusic implements Music {

    private DrillMusic(){}
    public static DrillMusic getDrillMusic() {
        return new DrillMusic();
    }
    @Override
    public String getSong() {
        return "SHE WOLF";
    }
    @Override
    public void doMyInit() {
        System.out.println("Initialization");
    }
    @Override
    public void doMyDestroy() {
        System.out.println("Destruction");
    }

}

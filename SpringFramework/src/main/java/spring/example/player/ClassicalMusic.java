package spring.example.player;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moon Sonata";
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

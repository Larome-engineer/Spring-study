package spring.example.player;

public class AlternativeMusic implements Music{
    @Override
    public String getSong() {
        return "Can u feel my heart";
    }

    @Override
    public void doMyInit() {

    }

    @Override
    public void doMyDestroy() {

    }

}

package Strategy;

public class HighFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Flys high");
    }
}

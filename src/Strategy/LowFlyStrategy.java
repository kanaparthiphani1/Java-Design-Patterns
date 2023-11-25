package Strategy;

public class LowFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Flys low");
    }
}

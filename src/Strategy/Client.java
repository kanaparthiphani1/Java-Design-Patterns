package Strategy;

public class Client {
    public static void main(String[] args) {
        Bird b = new Eagle(new HighFlyStrategy());
        b.fly();
    }
}

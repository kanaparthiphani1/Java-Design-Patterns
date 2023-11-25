package Strategy;

public class Pigeon extends Bird{
    private FlyStrategy f;
    Pigeon(FlyStrategy f){
        this.f = f;
    }
    public void fly(){
        f.fly();
    }
}

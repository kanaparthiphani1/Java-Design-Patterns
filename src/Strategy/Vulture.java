package Strategy;

public class Vulture extends Bird {
    private FlyStrategy f;
    Vulture(FlyStrategy f){
        this.f = f;
    }
    public void fly(){
        f.fly();
    }
}

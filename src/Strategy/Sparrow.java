package Strategy;

public class Sparrow extends Bird{
    private FlyStrategy f;
    Sparrow(FlyStrategy f){
        this.f = f;
    }
    public void fly(){
        f.fly();
    }
}

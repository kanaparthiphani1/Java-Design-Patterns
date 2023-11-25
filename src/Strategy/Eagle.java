package Strategy;

public class Eagle extends Bird{
    private FlyStrategy f;
    Eagle(FlyStrategy f){
        this.f = f;
    }
    public void fly(){
        f.fly();
    }
}

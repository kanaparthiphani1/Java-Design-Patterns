package PrototypeRegistry;

public class Client {
    public static void fillRegistry(Registry r){
        Character ch  = new Character();
        ch.setType("Viilian");
        ch.setHealth(5);
        ch.setSkilRate(5);
        r.register("MainVillain", ch);
    }

    public static void main(String[] args) {
        Registry r = new Registry();
        fillRegistry(r);
        r.get("MainVillan").clone();

    }
}

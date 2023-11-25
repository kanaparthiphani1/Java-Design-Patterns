package PrototypeRegistry;

public class Character implements Prototype<Character> {
    private String name;
    private String type;
    private int height;
    private String color;
    private int health;
    private int skilRate;

    Character(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSkilRate() {
        return skilRate;
    }

    public void setSkilRate(int skilRate) {
        this.skilRate = skilRate;
    }

    Character(Character c){
        this.skilRate = c.skilRate;
        this.health = c.health;
    }

    @Override
    public Character clone() {
        return new Character(this);
    }
}

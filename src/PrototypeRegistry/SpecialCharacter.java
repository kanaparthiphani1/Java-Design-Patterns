package PrototypeRegistry;

public class SpecialCharacter extends Character{
    private int guns;

    SpecialCharacter(){

    }
    SpecialCharacter(SpecialCharacter s){
        super(s);
        this.guns = s.guns;
    }

    public SpecialCharacter clone(){
        return new SpecialCharacter(this);
    }
}

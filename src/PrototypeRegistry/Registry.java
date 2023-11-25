package PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String,Character> register = new HashMap<>();
    public void register(String name, Character obj){
        register.put(name, obj);
    }

    public Character get(String name){
        return register.get(name);
    }
}

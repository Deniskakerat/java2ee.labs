package CharacterCreator.DnDClass.Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Halflingy extends CharacterClass {
    private List<String> keys;
    public Halflingy(){
        this.name = "Ranger";
        this.dice = 10;
        this.keys = new ArrayList<>();
        this.keys.add("Beast Master");

    }
    public void printMagica(){
        System.out.println("Class : " + name + " has keys ");
        for(String keys : keys){
            System.out.println(keys);
        }
    }
}
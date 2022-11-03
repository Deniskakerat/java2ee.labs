package CharacterCreator.DnDClass.Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Hobgoblin extends CharacterClass{
    private List<String> keys;
    public Hobgoblin(){
        this.name = "Hobgoblin";
        this.dice = 12;
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

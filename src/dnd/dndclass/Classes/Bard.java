package dnd.dndclass.Classes;


import java.util.ArrayList;
import java.util.List;

public class Bard extends CharacterClass {
    private List<String> keys;

    public Bard() {
        this.name = "Bard";
        this.dice = 8;
        this.keys = new ArrayList<>();
        this.keys.add("Charm Person");
        this.keys.add("Heroism");

    }


    public void printMagica() {
        System.out.println("Class : " + name + " has keys ");
        for (String keys : keys) {
            System.out.println(keys);
        }
    }
}


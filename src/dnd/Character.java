package dnd;

import dnd.Stats;
import dnd.dndclass.Classes.CharacterClass;
import dnd.dndRace.CharacterRace;

import java.util.Set;

public class Character {
    private String name;
    private CharacterClass dndclass;
    private CharacterRace race;
    private int health;
    private Stats chState;

    public CharacterRace getRace(){
        return race;
    }
    public void setRace(CharacterRace race){
        this.race = race;
    }

    public Character(String name, CharacterClass dndclass, CharacterRace race) {
        this.name = name;
        this.dndclass = dndclass;
        this.race = race;
    }
    public void addRaceBonuses(){
        Set<String> key = this.chState.getAttrib().keySet();
        for(String title:key){
            System.out.println(this.race.getRaceBonuses().getAttrib().get(title));
            int val = this.chState.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.chState.getAttrib().put(title,val);
        }
        this.health+=Math.floor(this.chState.getAttrib().get("Constitusion")/2)-5;
    }

    public void setAtributes(Stats attributes){
        this.chState = attributes;
    }
    public Stats getAtributes(){
        return chState;
    }

    public void printSheet(){
        System.out.println("Name " + name + "\nClass " + dndclass.toString() + "\n Health point " + health);
        dndclass.printMagica();
        race.print();
        chState.printStats();
    }

    public void battleCry(){
        race.shout();
    }
    /*public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getdndclass(){
        return dndclass;
    }
    public void setdndclass(String dndclass){
        this.dndclass = dndclass;
    }
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race = race;
    }*/

}

package CharacterCreator;

import CharacterCreator.DnDClass.Classes.CharacterClass;
import CharacterCreator.DnDRace.CharacterRace;
import DataVisitor.DataElement;
import DataVisitor.DataElementsVisitor;

import java.util.Map;
import java.util.Set;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndclass;
    private CharacterRace race;
    private int health;
    private Stats chState;

    public CharacterRace getRace(){
        return race;
    }
    public CharacterClass getDndClass(){
        return dndclass;
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
            int val = this.chState.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.chState.getAttrib().put(title,val);
        }
        this.health+=Math.floor(this.chState.getAttrib().get("Constitution")/2)-5;
    }

    public void setAtributes(Stats attributes) {
        this.chState = attributes;
    }
    public Stats getAtributes() {

        return this.chState;
    }

    public void printSheet() {
        System.out.println("Name: " + name + "\n" + dndclass.toString() + "\n Health points: " + health);
        dndclass.printMagica();
        race.print();
        chState.printStats();
    }

    public void battleCry() {
        race.shout();
    }
    @Override

    public Map access (DataElementsVisitor vis) {
        return vis.visit(this);
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
}

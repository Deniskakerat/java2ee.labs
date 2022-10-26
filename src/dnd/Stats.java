package dnd;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    private Map<String,Integer> attrib;
   /* private Stats state;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intellect;
    protected int wisdom;
    protected int charisma;*/

    public Stats(int s, int d, int c, int i, int w,
                 int ch) {
        this.attrib = new HashMap<String, Integer>();
        this.attrib.put("Strength",s);
        this.attrib.put("Dexterity",d);
        this.attrib.put("Constitusion",c);
        this.attrib.put("Intellect",i);
        this.attrib.put("Wisdom",w);
        this.attrib.put("Charisma",ch);
    }
    public  Map<String , Integer> getAttrib(){
        return attrib;
    }
    public void setAttrib(Map<String , Integer> attrib){
        this.attrib = attrib;
    }
    public static Stats generate() {
        Cube dice = new Cube();
        return new Stats(dice.random(),dice.random(),dice.random(),dice.random(),
                dice.random(),dice.random());
    }
    public void printStats() {
        System.out.println("~~~~~Attribute Sheets~~~~~\nThe strength " + this.attrib.get("Strength") +
                "\nthe dexterity " +  this.attrib.get("Dexterity")  +
                "\nthe constitution " +  this.attrib.get("Constitution")  +
                "\nthe intellect " +  this.attrib.get("Intellect")  +
                "\nthe wisdom " +  this.attrib.get("Wisdom")  +
                "\nthe charisma " +  this.attrib.get("Charisma")
        );
    }

/*
    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public Stats getState() {
        return state;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getStrength() {
        return strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public Stats(Stats state) {
        this.state = state;
    }*/


}

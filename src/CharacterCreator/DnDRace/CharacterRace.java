package CharacterCreator.DnDRace;


import CharacterCreator.Stats;
import DataVisitor.DataElement;
import DataVisitor.DataElementsVisitor;

import java.util.Set;
import java.util.TreeMap;

public abstract class
CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public Stats getRaceBonuses(){
        return bonuses;
    }
    public abstract void shout();

    public String toString(){
        return name;
    }
    public void print (){
        System.out.println("Race :"+ name);
        Set<String> key = bonuses.getAttrib().keySet();
        for(String title:key){
            if(bonuses.getAttrib().get(title)!=0){
                System.out.println("Race bonuse: " + title +" " + bonuses.getAttrib().get(title));
            }
        }
    }

}

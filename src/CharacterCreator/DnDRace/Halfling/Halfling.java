package CharacterCreator.DnDRace.Halfling;

import CharacterCreator.DnDRace.CharacterRace;
import CharacterCreator.Stats;

public abstract class Halfling extends CharacterRace {

    Halfling(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}
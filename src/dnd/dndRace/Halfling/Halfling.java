package dnd.dndRace.Halfling;

import dnd.Stats;
import dnd.dndRace.CharacterRace;

public class Halfling extends CharacterRace {

    Halfling(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}
package dnd.dndRace.Ranger;

import dnd.Stats;
import dnd.dndRace.CharacterRace;

public class Ranger extends CharacterRace {

    Ranger(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}

package dnd.dndRace.Bard;

import dnd.Stats;
import dnd.dndRace.CharacterRace;

public class Bard extends CharacterRace {

    Bard(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}

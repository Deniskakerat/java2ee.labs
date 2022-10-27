package dnd.dndRace.Hobgoblin;

import dnd.Stats;
import dnd.dndRace.CharacterRace;

public class Hobgoblin extends CharacterRace {

    Hobgoblin(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}

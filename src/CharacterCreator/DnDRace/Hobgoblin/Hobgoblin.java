package CharacterCreator.DnDRace.Hobgoblin;

import CharacterCreator.DnDRace.CharacterRace;
import CharacterCreator.Stats;

public abstract class Hobgoblin extends CharacterRace {

    Hobgoblin(String name, Stats state){
        this.name = name;
        this.bonuses = state;
    }
    @Override
    public void shout(){
        System.out.println("Shout!");
    }
}

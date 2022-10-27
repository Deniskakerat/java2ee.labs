package dnd.dndRace.Hobgoblin;

import dnd.Stats;
import dnd.dndRace.Halfling.Halfling;
import dnd.dndRace.Hobgoblin.Hobgoblin;
import dnd.dndRace.RaceAbstractFactory;
import java.util.HashMap;

public class HobgoblinFactory implements RaceAbstractFactory {
    HashMap<String, Stats> bardType = new HashMap<>();

    @Override
    public Hobgoblin create(){
        return new Hobgoblin("Halflingy", new Stats(0, 0, 2, 1, 0, 0));
    }
}

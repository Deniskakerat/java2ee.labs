package dnd.dndRace.Halfling;

import dnd.Stats;
import dnd.dndRace.RaceAbstractFactory;
import dnd.dndRace.Halfling.Halfling;

import java.util.HashMap;

public class HalflingFactory  implements RaceAbstractFactory {
   // HashMap<String, Stats> rangerType = new HashMap<>();

    @Override
    public Halfling create(){
        return new Halfling("Halflingy", new Stats(0, 2, 1, 0, 0, 0));
    }
}
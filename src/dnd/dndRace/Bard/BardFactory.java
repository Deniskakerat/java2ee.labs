package dnd.dndRace.Bard;

import dnd.Stats;
import dnd.dndRace.RaceAbstractFactory;
import java.util.HashMap;

public class BardFactory implements RaceAbstractFactory {
    HashMap<String, Stats> bardType = new HashMap<>();

    @Override
    public Bard create(String type){
        if(bardType.isEmpty()) {
            bardType.put("Brave Bard", new Stats(0, 0, 24, 0, 12, 0));
        }
        return new Bard(type,bardType.get(type));
    }
}

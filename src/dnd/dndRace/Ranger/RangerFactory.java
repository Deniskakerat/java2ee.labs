package dnd.dndRace.Ranger;

import dnd.Stats;
import dnd.dndRace.Ranger.Ranger;
import dnd.dndRace.RaceAbstractFactory;

import java.util.HashMap;

public class RangerFactory implements RaceAbstractFactory {
    HashMap<String, Stats> bardType = new HashMap<>();

    @Override
    public Ranger create(String type){
        if(bardType.isEmpty()) {
            bardType.put("Ranger", new Stats(0, 0, 6, 0, 3, 0));
        }
        return new Ranger(type,bardType.get(type));
    }
}

package dnd.dndRace.Ranger;

import dnd.Stats;
import dnd.dndRace.RaceAbstractFactory;
import java.util.HashMap;

public class RangerFactory implements RaceAbstractFactory {
    HashMap<String, Stats> rangerType = new HashMap<>();

    @Override
    public Ranger create(String type){
        if(rangerType.isEmpty()) {
            rangerType.put("Ranger", new Stats(0, 0, 9, 0, 3, 0));
        }
        return new Ranger(type,rangerType.get(type));
    }
}

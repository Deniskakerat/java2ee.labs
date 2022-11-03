package CharacterCreator.DnDRace.Halfling;

import CharacterCreator.DnDRace.RaceAbstractFactory;
import CharacterCreator.Stats;
import DataVisitor.DataElementsVisitor;;
import java.util.Map;
import java.util.TreeMap;

public class HalflingFactory  implements RaceAbstractFactory {
    TreeMap<String, Stats> HalflingType = new TreeMap<>();

    @Override
    public Halfling create(){
        return new Halfling("Halflingy", new Stats(0, 2, 1, 0, 0, 0)) {
            @Override
            public Map access(DataElementsVisitor vis) {
                return HalflingType;
            }
        };
    }
}
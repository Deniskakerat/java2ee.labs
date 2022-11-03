package CharacterCreator.DnDRace.Hobgoblin;

import CharacterCreator.DnDRace.RaceAbstractFactory;
import CharacterCreator.Stats;
import DataVisitor.DataElementsVisitor;

import java.util.Map;
import java.util.TreeMap;

public class HobgoblinFactory implements RaceAbstractFactory {
    TreeMap<String, Stats> Hobgoblin = new TreeMap<>();

    @Override
    public Hobgoblin create(){
        return new Hobgoblin("Halflingy", new Stats(0, 0, 0, 0, 0, 0)) {
            @Override
            public Map access(DataElementsVisitor vis) {
                return Hobgoblin;
            }
        };
    }
}

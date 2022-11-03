package DataVisitor;
import CharacterCreator.DnDClass.Classes.CharacterClass;
import CharacterCreator.DnDRace.CharacterRace;
import CharacterCreator.Stats;
import CharacterCreator.Character;

import java.util.TreeMap;

public interface DataElementsVisitor {
    public TreeMap visit(Character ch) ;

    public TreeMap visit(CharacterClass cl);

    public TreeMap visit(CharacterRace cr);

    public TreeMap visit(Stats st);
}


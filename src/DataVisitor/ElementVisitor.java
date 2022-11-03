package DataVisitor;
import CharacterCreator.Character;
import CharacterCreator.DnDClass.Classes.CharacterClass;
import CharacterCreator.DnDRace.CharacterRace;
import CharacterCreator.Stats;
import java.util.TreeMap;

public class ElementVisitor implements DataElementsVisitor {
    @Override
    public TreeMap visit(Character ch) {
        TreeMap jobj = new TreeMap();
        jobj.put("Name", ch.getName());
        jobj.put("HP", ch.getHealth());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterClass cl) {
        TreeMap jobj = new TreeMap();
        jobj.put("Class", cl.toString());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterRace cr) {
        TreeMap jobj = new TreeMap();
        jobj.put("Class", cr.toString());
        return jobj;
    }

    @Override
    public TreeMap visit (Stats st) {
        TreeMap jobj = new TreeMap();
        jobj.put("Attributes", st.getAttrib());
        return jobj;
    }
}


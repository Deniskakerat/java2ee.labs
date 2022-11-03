
import CharacterCreator.DnDClass.Factory.ClassFactory;
import CharacterCreator.DnDRace.Halfling.HalflingFactory;
import CharacterCreator.DnDRace.Hobgoblin.HobgoblinFactory;
import CharacterCreator.DnDRace.RaceFactory;
import CharacterCreator.Stats;
import DataVisitor.DataElement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import CharacterCreator.Character;
import DataVisitor.ElementVisitor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        ElementVisitor visitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");
        Character player1 = new Character("Thorin II \"Oakenshield\"",
                ClassFactory.getClass("Hobgoblin"),
                RaceFactory.getRace(new HobgoblinFactory(), "Hobgoblin"));
        player1.setAtributes(Stats.generate());
        player1.addRaceBonuses();
        List<DataElement> list = new ArrayList();
        list.add(player1);
        list.add(player1.getDndClass());
        list.add(player1.getRace());
        list.add(player1.getAtributes());
        /*JSONArray ar = new JSONArray();
        ar.add(jsonObject);*/
        list.toString();

        for (DataElement elem : list) {
            jsonObject.putAll(elem.access(visitor));
        }
        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();
        Character player2 = new Character("Halflingy",
                ClassFactory.getClass(" Halflingy"),
                RaceFactory.getRace(new HalflingFactory(), "Halflingy"));
        player2.setAtributes(Stats.generate());
        list.add(player2);
        list.add(player2.getDndClass());
        list.add(player2.getRace());
        list.add(player2.getAtributes());
        for (DataElement elem : list) {
            jsonObject.putAll(elem.access(visitor));
        }
        file.write(",");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();

    }
}
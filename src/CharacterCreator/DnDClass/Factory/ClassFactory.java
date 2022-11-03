package CharacterCreator.DnDClass.Factory;


import CharacterCreator.DnDClass.Classes.CharacterClass;
import CharacterCreator.DnDClass.Classes.Halflingy;
import CharacterCreator.DnDClass.Classes.Hobgoblin;
import DataVisitor.DataElementsVisitor;

import java.util.Map;

//import
public class ClassFactory {
    public static CharacterClass getClass(String type) {
        if ("Hobgoblin".equalsIgnoreCase(type)) return new Hobgoblin() {
            @Override
            public Map access(DataElementsVisitor vis) {
                return this;
            }
        };
        else if ("Halflingy".equalsIgnoreCase(type)) return new Halflingy() {
            @Override
            public Map access(DataElementsVisitor vis) {
                return null;
            }
        };
        return null;
    }
}

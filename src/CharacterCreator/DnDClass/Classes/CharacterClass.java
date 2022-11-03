package CharacterCreator.DnDClass.Classes;

import DataVisitor.DataElement;
import DataVisitor.DataElementsVisitor;

import java.util.TreeMap;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int dice;

    public abstract void printMagica();

    public int getDice() {
        return dice;
    }

    public String toString() {
        return "Class : " + name + " uses " + dice + " D dice to roll hp";
    }

}

package dnd.dndclass.Classes;

public abstract class CharacterClass {
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

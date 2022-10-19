package memento;

public class Stats {
    private Stats state;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intellect;
    protected int wisdom;
    protected int charisma;

    Stats(int s, int d, int c, int i, int w, int ch) {
        this.strength = s;
        this.dexterity = d;
        this.constitution = c;
        this.intellect = i;
        this.wisdom = w;
        this.charisma = ch;
    }


    public static Stats generate() {
        Cube dice = new Cube();
        return new Stats(dice.random(),dice.random(),dice.random(),dice.random(),
                dice.random(),dice.random());
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public Stats getState() {
        return state;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getStrength() {
        return strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public Stats(Stats state) {
        this.state = state;
    }

    public void printStats() {
        System.out.println("~~~~~Attribute Sheets~~~~~\nThe strength " + this.strength +
                "\nthe dexterity " + this.dexterity +
                "\nthe constitution " + this.constitution +
                "\nthe intellect " + this.intellect +
                "\nthe wisdom " + this.wisdom +
                "\nthe charisma " + this.charisma
        );
    }
}

package dnd;
import dnd.dndRace.Bard.BardFactory;
import dnd.dndRace.RaceFactory;
import dnd.dndclass.Classes.Bard;
import dnd.dndclass.Factory.ClassFactory;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Durin", ClassFactory.getClass("Bard"),
        RaceFactory.getRace(new BardFactory(), "Clever Bard"));
        player.setAtributes(Stats.generate());
        player.addRaceBonuses();
        player.printSheet();
        player.battleCry();

        Character player2 = new Character("Durin", ClassFactory.getClass("Ranger"),
                RaceFactory.getRace(new BardFactory(), "Clever Bard"));
        player2.setAtributes(Stats.generate());
        player2.addRaceBonuses();
        player2.printSheet();
        player2.battleCry();

    }
}
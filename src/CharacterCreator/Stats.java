package CharacterCreator;

import DataVisitor.DataElement;
import DataVisitor.DataElementsVisitor;

import java.util.Map;
import java.util.TreeMap;

/*it is our originator class*/
public class Stats implements DataElement {
    private Map<String, Integer> attrib;

    public Stats(int s, int d, int c, int i, int w, int ch) {
        this.attrib = new TreeMap<String, Integer>();
        this.attrib.put("strength", s);
        this.attrib.put("Dexterity", d);
        this.attrib.put("Constitution", c);
        this.attrib.put("Intelligence", i);
        this.attrib.put("wisdom", w);
        this.attrib.put("Charisma", ch);
    }

    public Map<String, Integer> getAttrib() {
        return attrib;
    }

    public static Stats generate() {
        return new Stats(Dice.rollstat(), Dice.rollstat(), Dice.rollstat(), Dice.rollstat(), Dice.rollstat(),
                Dice.rollstat());
    }

    public void printStats() {
        System.out.println("~~~~~~~~Attributes Sheet~~~~~\nStrength: " + this.attrib.get("Strength") +
                "\nDextenity: " + this.attrib.get("Dextenity ") + "\nСonstitution: " +
                this.attrib.get("Сonstitution") + "\nIntelligence: " +
                this.attrib.get("Intelligence") + "\nWisdom: " +
                this.attrib.get("Wisdom") + "Charisma: " + this.attrib.get("Charisma") + "\n");
    }
        public Memento save () {
            return new Memento(attrib);
        }
        public void undoToLastSave (Object obj){
            Memento memento = (Memento) obj;
            this.attrib = memento.attrib;
        }
        @Override
        public Map access(DataElementsVisitor vis){
            return vis.visit(this);
        }
        private class Memento {
            public Map<String, Integer> attrib;
            private Stats state;
            private Map atr;

            Memento() {
            }
            Memento(Map atr) {
                this.atr = atr;
            }
            public void getStateFromMemento(Memento memento) {
                this.state = state;
            }

            public Stats getState(Memento memento) {
                return this.state;
            }

            public Stats getState(Stats state) {
                return this.state;
            }
    }
}




package memento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Character player = new Character("Aladdin","bowman" , "elif");
        Stats temp = Stats.generate();
        player.setAtributes(temp);
        player.PrintSheet();

        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento();

        temp = Stats.generate();
        temp.printStats();
        mem.setState(temp);
        careTaker.add(mem.saveStateToMomento());

        temp = Stats.generate();
        temp.printStats();
        mem.setState(temp);
        careTaker.add(mem.saveStateToMomento());

        mem.getStateFromMomento(careTaker.get(0));
        temp = mem.getState(mem.saveStateToMomento());
        temp.printStats();

        mem.getStateFromMomento(careTaker.get(0));
        temp = mem.getState(mem.saveStateToMomento());
        temp.printStats();

        System.out.println("The end");

    }
}
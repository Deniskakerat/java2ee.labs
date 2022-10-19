package memento;

public class Memento {
    private Stats state;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intellect;
    protected int wisdom;
    protected int charisma;
    Memento(Stats state){
        this.state = state;
        this.strength = state.getStrength();
        this.dexterity = state.getDexterity();
        this.constitution = state.getConstitution();
        this.intellect = state.getIntellect();
        this.wisdom = state.getWisdom();
        this.charisma = state.getCharisma();
    }
    Memento(){}

    public Memento saveStateToMomento(){
        System.out.println("State ready to save");
        return new Memento(state);
    }
    public void getStateFromMomento(Memento memento){
        this.state = state;
    }

    public Stats getState(Memento memento){
        return this.state;
    }
    public Stats getState(Stats state){
        return this.state;
    }
    public void setState(Stats state){
        this.state = state;
        this.strength = state.getStrength();
        this.dexterity = state.getDexterity();
        this.constitution = state.getConstitution();
        this.intellect = state.getIntellect();
        this.wisdom = state.getWisdom();
        this.charisma = state.getCharisma();
    }

}

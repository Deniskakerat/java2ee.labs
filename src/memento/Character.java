package memento;

public class Character {
    private String name;
    private String dndclass;
    private String race;
    private Stats atributes;
    public void setAtributes(Stats atributes){
        this.atributes = atributes;
    }

    public Character(String name, String dndclass, String race) {
        this.name = name;
        this.dndclass = dndclass;
        this.race = race;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getdndclass(){
        return dndclass;
    }
    public void setdndclass(String dndclass){
        this.dndclass = dndclass;
    }
    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race = race;
    }
    public Stats getAtributes (){
        return atributes;
    }
    public void getAtributes(Stats atributes){
        this.atributes = atributes;
    }
    public void PrintSheet(){
        System.out.println("Name " + name + "\nClass " + dndclass + "\n Race " + race);
        atributes.printStats();
    }

}

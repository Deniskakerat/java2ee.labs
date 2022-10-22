package dnd.dndRace;

public class RaceFactory {

    public static CharacterRace getRace(RaceAbstractFactory factory, String type){
        return factory.create(type);
    }
}

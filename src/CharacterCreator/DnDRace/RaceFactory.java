package CharacterCreator.DnDRace;

public class RaceFactory {

    public static CharacterRace getRace(RaceAbstractFactory factory, String str){
        return factory.create();
    }
}

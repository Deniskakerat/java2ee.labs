package dnd;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    static int saveID = 0;
    public void add(Memento memento){
        mementoList.add(memento);
        System.out.println("Stete save "+saveID+ "\n");
        saveID++;
    }

    public Memento get(int index){
        System.out.println("Loading stats from save" + index);
        return mementoList.get(index);
    }
}

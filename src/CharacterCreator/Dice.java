package CharacterCreator;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    public static int roll(int dice) {
        return 1 + (int) (Math.random() * ((dice - 1) + 1));
    }

    public static int rollstat(){
    ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i< 6;i++){
            list.add(roll(6));
    }
            Collections.sort(list,Collections.reverseOrder());
    int sum = 0;
        for (int i=0; i<3; i++) {
        sum += list.get(i);
    }
        return sum;
}
}

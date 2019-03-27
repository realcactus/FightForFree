import role.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test{
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        Target role1 = new WarriorFactory().createCharacter();
        Target monster1 = new HardMonsterFactory().createElf();
        list.add(role1);
        list.add(monster1);
        Target monster2 = new NormalMonsterFactory().createElf();
        Target monster3 = new SimpleMonsterFactory().createElf();
        list.add(monster2);
        list.add(monster3);
        for(Object obj: list){
            System.out.println(obj.getClass().getName());
            System.out.println(obj.toString());
        }

    }
}

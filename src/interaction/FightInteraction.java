package interaction;
import Equipment.*;
import role.*;
import role.Character;
import skill.ISkill;
import skill.SimpleCut;
import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;
/**
 * @Author: Zhou Xiaosong
 */

/**
 * 战斗交互类，会调用战斗上下文
 */
public class FightInteraction {


    //这里写一个测试
    public static void main(String[] args){
        Character fighter = new WarriorFactory().createCharacter();
        ISkill skill = new SimpleCut();
        IEquip weapon = new SecretSword();
        IEquip clothes = new BeginnerClothes();
        IEquip shoes = new BeginnerShoes();
        IEquip ring = new BeginnerRing();
        IEquip helmet = new BeginnerHelmet();

        fighter.setSkill1(skill);

        fighter.setWeapon(weapon);
        fighter.setClothes(clothes);
        fighter.setHelmet(helmet);
        fighter.setShoes(shoes);
        fighter.setRing(ring);

        Monster monster = new SimpleMonsterFactory().createSlime();

        FightState state = new FightState();
        //初始化角色行动
        state.setValue(StatusCode.CHARACTER_STEP);
        FightContext fightContext = new FightContext(state);

        Map<String, Object> resultValues = new HashMap<>();
        while (true){
            if(state.getValue() == StatusCode.CHARACTER_DIE){
                //角色死亡，退出
                System.out.println("角色死亡");
                break;
            }
            if(state.getValue() == StatusCode.FIGHT_FINISH){
                //角色胜利，获得奖励
                System.out.println("角色胜利");
                break;
            }
            //角色行动
            resultValues = fightContext.fightWithMonster(fighter, monster, skill);
            //这里，怪物自动行动
            resultValues = fightContext.fightWithMonster(fighter, monster, skill);
        }
        System.out.println(resultValues);


    }
}

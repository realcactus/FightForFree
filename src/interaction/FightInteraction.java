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
        //测试一下mp情况
//        monster.setHp(1000000);

        FightState state = new FightState();
        //初始化角色行动
        state.setValue(StatusCode.CHARACTER_STEP);
        FightContext fightContext = new FightContext(state);

        int stepNum = 1;
        Map<String, Object> resultValues = new HashMap<>();

        //在这个地方有个小技巧
        //先用备忘录模式记录下原来的状态，然后用装备信息更新角色信息，进入战斗
        CharacterStateManage characterStateManage = new CharacterStateManage();
        characterStateManage.setMemento(fighter.saveMemento());

        //根据装备信息更新角色数值
        fighter.setHp(fighter.calculateHp());
        fighter.setMp(fighter.calculateMp());
        fighter.setPhysicalAtk(fighter.calculatePhysicalAtk());
        fighter.setMagicalAtk(fighter.calculateMagicalAtk());
        fighter.setPhysicalDef(fighter.calculatePhysicalDef());
        fighter.setMagicalDef(fighter.calculateMagicalDef());
        fighter.setCritRate(fighter.calculateCritRate());
        fighter.setBloodSucking(fighter.calculateSuckBloodRate());

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
            System.out.println("*****************************************************************");
            System.out.println("第"+stepNum+"回合");
            System.out.println("-----战斗前------");
            show(fighter);
            show(monster);
            System.out.println("-----角色行动------");
            resultValues = fightContext.fightWithMonster(fighter, monster, skill);
            System.out.println("-----角色行动后状态更新------");
            show(fighter);
            show(monster);
            //这里，怪物自动行动
            System.out.println("-----怪物行动------");
            resultValues = fightContext.fightWithMonster(fighter, monster, skill);
            System.out.println("-----怪物行动后状态更新------");
            show(fighter);
            show(monster);
            stepNum ++;
            System.out.println("*****************************************************************");

        }

        //战斗结束
        // 恢复备忘录备份的数据
        fighter.recover(characterStateManage.getMemento());
        System.out.println("-----收获------");
        System.out.println(resultValues);


    }

    public static void show(Target target){
        System.out.println(target.toString());
    }
}

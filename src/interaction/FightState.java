package interaction;

/**
 * @Author: Zhou Xiaosong
 */

import Equipment.*;
import role.*;
import role.Character;
import skill.ISkill;
import utils.StatusCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 战斗状态类
 */
public class FightState {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //角色使用技能
    //这里平砍写在了一起，平砍无非就是skill是个null对象
    public Map<String, Object> characterAction(Character character, ISkill skill){
        if(skill == null){
            return character.physicalCut();
        }
        Map<String, Object> valueResults = character.excuteSkill(character, skill);
        if(valueResults == null){
            //魔法不够，默认改为平砍
            return character.physicalCut();
        }
        return valueResults;
    }

    //怪物使用技能
    public Map<String, Object> monsterAction(Target monster, ISkill skill) throws Exception {
        if(skill == null){
            //平砍
            return monster.physicalCut();
        }
        //TODO:目前只写了怪物平砍人物，因此这里写了一个抛出异常的部分，防止传递技能参数
        throw new Exception("目前怪物没有写技能，无法传递技能！！");
    }

    //游戏结束，返回掉落装备
    //物品的掉落与具体怪物和怪物的等级相关
    //目前游戏里有简单史莱姆，中等史莱姆，困难史莱姆，简单精灵，中级精灵，困难精灵
    //简单巨龙，中等巨龙，困难巨龙
    //一共9种怪物
    //TODO：暂时先只掉落秘银之剑，新手套装，暂时每局结束都只掉落一件装备
    public Map<String, Object> reward(Monster monster){
        List<Object> rewardsItems = new ArrayList<>();
        int num = new Double(Math.random()*100).intValue();
        int caseValue = num / 20;
        Object obj = null;
        switch (caseValue){
            case 0:
                obj = new SecretSword();
                break;
            case 1:
                obj = new BeginnerHelmet();
                break;
            case 2:
                obj = new BeginnerClothes();
                break;
            case 3:
                obj = new BeginnerShoes();
                break;
            case 4:
                obj = new BeginnerRing();
        }
        rewardsItems.add(obj);

        int rewardExperience = 0;
        int rewardMoney = 0;
        //根据怪物来判断掉落经验和金钱
        int diffculty = monster.getDifficulty();

        if(diffculty==StatusCode.MONSTER_SIMPLE){
            if (monster instanceof Slime){
                rewardExperience = 100;
                rewardMoney = 100;
            }
            else if (monster instanceof Elf){
                rewardExperience = 300;
                rewardMoney = 300;
            }
            else if (monster instanceof Dragon){
                rewardExperience = 2000;
                rewardMoney = 10000;
            }
        }
        else if(diffculty == StatusCode.MONSTER_NORMAL){
            if (monster instanceof Slime){
                rewardExperience = 500;
                rewardMoney = 500;
            }
            else if (monster instanceof Elf){
                rewardExperience = 800;
                rewardMoney = 800;
            }
            else if (monster instanceof Dragon){
                rewardExperience = 5000;
                rewardMoney = 50000;
            }
        }
        else if (diffculty == StatusCode.MONSTER_HARD){
            if (monster instanceof Slime){
                rewardExperience = 1000;
                rewardMoney = 1000;
            }
            else if (monster instanceof Elf){
                rewardExperience = 1500;
                rewardMoney = 1500;
            }
            else if (monster instanceof Dragon){
                rewardExperience = 10000;
                rewardMoney = 150000;
            }
        }

        Map<String,Object> result = new HashMap<>();
        result.put(StatusCode.DROP_ITEM, rewardsItems);
        result.put(StatusCode.DROP_EXP, rewardExperience);
        result.put(StatusCode.DROP_MONEY,rewardMoney);
        return result;
    }

}

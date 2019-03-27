package interaction;

/**
 * @Author: Zhou Xiaosong
 */

import role.*;
import role.Character;
import role.Target;
import skill.ISkill;
import skill.SimpleCut;
import utils.StatusCode;

import java.util.List;
import java.util.Map;

/**
 * 战斗上下文类，持有一个战斗状态对象
 */
public class FightContext {
    //战斗状态对象
    private FightState fightState;

    public FightContext(FightState fightState) {
        this.fightState = fightState;
    }

    public FightState getFightState() {
        return fightState;
    }

    public void setFightState(FightState fightState) {
        this.fightState = fightState;
    }
    public Map<String, Object> fightWithMonster(Character character, Monster monster, ISkill skill){
        if (fightState.value == StatusCode.CHARACTER_STEP){
            //角色行动
            Map<String, Object> actionResult = fightState.characterAction(character,skill);
            //更新角色增益
            character.updateStatus(actionResult);
            //产生伤害
            int damage = 0;
            if(actionResult.containsKey(StatusCode.ATK_DAMAGE)){
                //物理伤害，要减去防御
                damage += (int)(actionResult.get(StatusCode.ATK_DAMAGE)) - monster.getPhysicalDef();
            }
            if(actionResult.containsKey(StatusCode.MATK_DAMAGE)){
                //法术伤害，要减去法术防御
                damage += (int)(actionResult.get(StatusCode.MATK_DAMAGE)) - monster.getMagicalDef();
            }
            //打不动
            if(damage <= 0){
                fightState.setValue(StatusCode.MONSTER_STEP);
                return null;
            }
            monster.setHp(monster.getHp() - damage);
            if(monster.getHp() <= 0){
                //怪死了，跳转到状态三，执行结算
                fightState.setValue(StatusCode.FIGHT_FINISH);
            }
            else{
                //转到怪物行动状态
                fightState.setValue(StatusCode.MONSTER_STEP);
            }
        }
        else if (fightState.getValue() == StatusCode.MONSTER_STEP){
            //怪物行动
            int damage = (int)(monster.physicalCut().get(StatusCode.ATK_DAMAGE));
            damage -= character.calculatePhysicalDef();
            if(damage <= 0){
                fightState.setValue(StatusCode.CHARACTER_STEP);
                return null;
            }
            character.setHp(character.getHp() - damage);
            if(character.getHp() <= 0){
                //人死了，跳转到状态四，人死了肯定没有奖励
                fightState.setValue(StatusCode.CHARACTER_DIE);
            }
            else{
                //转到人物行动状态
                fightState.setValue(StatusCode.CHARACTER_STEP);
            }
        }
        else if(fightState.getValue() == StatusCode.FIGHT_FINISH){
            //结算业务
            Map<String, Object> items = fightState.reward(monster);
            return items;
        }
        else if(fightState.getValue() == StatusCode.CHARACTER_DIE){
            //人死，返回空值
            return null;
        }
        return null;
    }
}

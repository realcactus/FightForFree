package interaction;

/**
 * @Author: Zhou Xiaosong
 */

import role.Character;
import skill.ISkill;

import java.util.List;
import java.util.Map;

/**
 * 可释放技能接口
 */
public interface Skillable {
    //使用单个技能
    //如果魔法不够，返回null
    //在施放之前扣除魔法
    public Map<String,Object> excuteSkill(Character character);
}

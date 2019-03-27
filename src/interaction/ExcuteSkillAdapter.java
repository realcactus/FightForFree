package interaction;

import com.sun.xml.internal.bind.v2.TODO;
import role.Character;
import skill.DamageSkill;
import skill.GainSkill;
import skill.ISkill;
import skill.WeakenSkill;
import utils.StatusCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 这个适配器非常重要
 * 这里这个像是适配器又像是代理，总的来说就是因为使用技能如果是伤害类技能，是要算上装备来看人物原有的属性的
 * 并且Character也传进来了，可以在这里统一计算
 */
public class ExcuteSkillAdapter implements Skillable{
    private ISkill skill;

    public ExcuteSkillAdapter(ISkill skill) {
        this.skill = skill;
    }

    @Override
    public Map<String, Object> excuteSkill(Character character) {
        //如果魔法不够，返回null
        if(character.getMp() < skill.getNeedMp()){
            return null;
        }
        //在施放之前扣除魔法
        character.setMp(character.getMp() - skill.getNeedMp());


        //计算伤害的逻辑都在这里
        Map<String, Object> values = new HashMap<>();
        //根据不同的技能逻辑来处理不同的情况
        if(skill instanceof DamageSkill){
            //攻击类技能，一般就要考虑人物的攻击类属性，计算输出伤害
            int fixedDamage = ((DamageSkill) skill).calculateFixedDamage();
            double atkPercentage = ((DamageSkill) skill).calculateAtkPercentage();
            double matkPercentage = ((DamageSkill) skill).calculateMatkPercentage();
            //这里计算人物的装备属性加成
            //关注的有：物理攻击、法术攻击、吸血、暴击
            //但是技能暂时不带吸血暴击效果
            //**********************************************************
            //这里非常重要一点，就是在这里技能计算百分比，直接按照人物的属性来，不看装备
            //因为用了备忘录模式，已经是叠加过装备状态的
            int physicalAtk = character.getPhysicalAtk();
            int magicalAtk = character.getMagicalAtk();
            if(atkPercentage > 0){
                int damageAtk = fixedDamage + (int)(physicalAtk * atkPercentage);
                values.put(StatusCode.ATK_DAMAGE,damageAtk);
            }
            //魔法攻击
            if(matkPercentage > 0){
                int damageMatk = fixedDamage + (int)(magicalAtk * matkPercentage);
                values.put(StatusCode.MATK_DAMAGE,damageMatk);
            }
            //吸血
            //如果攻击带吸血效果，那么先产生输出，然后更新角色状态（错）
            //这个接口当初设计是错误的，更新角色状态应该在战斗上下文类更新

            //暴击
            //技能也可能是自带暴击效果的
            //TODO:因为技能携带吸血和暴击效果的目前还没设计，这里先不写
        }
        else if (skill instanceof GainSkill){
            //增益技能
            //TODO:增加增益技能接口
        }
        else if (skill instanceof WeakenSkill){
            //削弱节能
            //TODO:增加削弱技能接口，削弱怪物状态
        }
        return values;
    }


}

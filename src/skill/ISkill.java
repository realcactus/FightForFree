package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 技能接口
 */
/*
技能有几种：
    （1）伤害技能，固定基础伤害fixedDamage，攻击伤害百分比atkPercentage，魔法伤害百分比matkPercentage。
    （2）增益技能，回复气血restoreHp，增加自身物理防御increasePdef，增加法术防御increaseMdef
    （3）削弱状态技能，减少怪物物理防御weakenPdef，减少怪物法术防御weakenMdef
 */
public interface ISkill {
    int calculateFixedDamage();
    double calculateAtkPercentage();
    double calculateMatkPercentage();
    int calculateRestoreHp();
    int calculateIncreasePdef();
    int calculateIncreaseMdef();
    int calculateWeakenPdef();
    int calculateWeakenMdef();
}

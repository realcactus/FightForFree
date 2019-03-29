package skill;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 技能接口
 */
/*
技能有几种：
    （1）伤害技能，固定基础伤害fixedDamage，攻击伤害百分比atkPercentage，魔法伤害百分比matkPercentage。
    （2）增益技能，回复气血restoreHp，增加自身物理防御increasePdef，增加法术防御increaseMdef
    （3）削弱状态技能，减少怪物物理防御weakenPdef，减少怪物法术防御weakenMdef
 */
public abstract class ISkill implements Serializable {
    //技能等级
    protected int level = 0;

    //施放技能所需魔法
    protected int needMp = 0;

    /**
     * 升级函数
     * @return 返回0 升级成功，返回-1 升级失败
     */
    public abstract void upLevel();
    public abstract int getLevelUpNeedMoney();
    public abstract int calculateFixedDamage();
    public abstract double calculateAtkPercentage();
    public abstract double calculateMatkPercentage();
    public abstract int calculateRestoreHp();
    public abstract int calculateIncreasePdef();
    public abstract int calculateIncreaseMdef();
    public abstract int calculateWeakenPdef();
    public abstract int calculateWeakenMdef();

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public int getNeedMp() {
        return needMp;
    }

    public void setNeedMp(int needMp) {
        this.needMp = needMp;
    }
}

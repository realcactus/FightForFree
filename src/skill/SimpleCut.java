package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 简单劈砍技能
 */
public class SimpleCut extends DamageSkill {

    //技能升级经验表，最高升到5级
    protected int[] experienceTable = {2000,5000,10000,30000,100000};
    public SimpleCut() {
        //初始等级为0
        this.level = 0;
        //1级使用需要Mp = 20
        this.needMp = 20;
        //固定伤害50点
        this.fixedDamage = 50;
        //物理攻击比例伤害10%
        this.atkPercentage = 0.1;
        //魔法攻击比例伤害0%
        this.matkPercentage = 0.0;
    }

    //获取升级所需要的金钱
    @Override
    public int getLevelUpNeedMoney() {
        return this.experienceTable[this.level];
    }

    @Override
    public void upLevel() {
        switch (this.level){
            case 0:
                setLevel(1);
                setNeedMp(40);
                setFixedDamage(100);
                setAtkPercentage(0.15);
                break;
            case 1:
                setLevel(2);
                setNeedMp(60);
                setFixedDamage(150);
                setAtkPercentage(0.20);
                break;
            case 2:
                setLevel(3);
                setNeedMp(80);
                setFixedDamage(200);
                setAtkPercentage(0.25);
                break;
            case 3:
                setLevel(4);
                setNeedMp(150);
                setFixedDamage(500);
                setAtkPercentage(0.50);
                break;
            case 4:
                setLevel(5);
                setNeedMp(200);
                setFixedDamage(800);
                setAtkPercentage(1.2);
        }
    }

    @Override
    public int calculateFixedDamage() {
        return this.fixedDamage;
    }

    @Override
    public double calculateAtkPercentage() {
        return this.atkPercentage;
    }

    @Override
    public double calculateMatkPercentage() {
        return matkPercentage;
    }


}

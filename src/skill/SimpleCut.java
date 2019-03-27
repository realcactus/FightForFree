package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 简单劈砍技能
 */
public class SimpleCut extends DamageSkill {
    public SimpleCut() {
        //简单劈砍1级升2级所需金钱为2000金币
        this.upLevelMoney = 2000;
        //初始等级为1
        this.level = 1;
        //1级使用需要Mp = 20
        this.needMp = 20;
        //固定伤害50点
        this.fixedDamage = 50;
        //物理攻击比例伤害10%
        this.atkPercentage = 0.1;
        //魔法攻击比例伤害0%
        this.matkPercentage = 0.0;
    }

    @Override
    public int upLevel() {
        switch (this.level){
            case 1:
                setLevel(2);
                setUpLevelMoney(5000);
                setNeedMp(40);
                setFixedDamage(100);
                setAtkPercentage(0.15);
            case 2:
                setLevel(3);
                setUpLevelMoney(10000);
                setNeedMp(60);
                setFixedDamage(150);
                setAtkPercentage(0.20);
            case 3:
                setLevel(4);
                setUpLevelMoney(30000);
                setNeedMp(80);
                setFixedDamage(200);
                setAtkPercentage(0.25);
            case 4:
                setLevel(5);
                setUpLevelMoney(100000);
                setNeedMp(150);
                setFixedDamage(500);
                setAtkPercentage(0.50);
        }
        return 0;
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

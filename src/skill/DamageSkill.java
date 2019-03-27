package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 这里采取一种设计就是用一个抽象类，实现具体类【不需要】实现的接口
 */
public abstract class DamageSkill extends ISkill {
    //固定伤害
    protected int fixedDamage;
    //比例伤害
    protected double atkPercentage;
    protected double matkPercentage;

    @Override
    public int calculateRestoreHp() {
        return 0;
    }

    @Override
    public int calculateIncreasePdef() {
        return 0;
    }

    @Override
    public int calculateIncreaseMdef() {
        return 0;
    }

    @Override
    public int calculateWeakenPdef() {
        return 0;
    }

    @Override
    public int calculateWeakenMdef() {
        return 0;
    }

    public int getFixedDamage() {
        return fixedDamage;
    }

    public void setFixedDamage(int fixedDamage) {
        this.fixedDamage = fixedDamage;
    }

    public double getAtkPercentage() {
        return atkPercentage;
    }

    public void setAtkPercentage(double atkPercentage) {
        this.atkPercentage = atkPercentage;
    }

    public double getMatkPercentage() {
        return matkPercentage;
    }

    public void setMatkPercentage(double matkPercentage) {
        this.matkPercentage = matkPercentage;
    }
}

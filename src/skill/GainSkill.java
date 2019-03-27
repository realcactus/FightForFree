package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 增益技能
 */
public abstract class GainSkill extends ISkill {
    @Override
    public int calculateFixedDamage() {
        return 0;
    }

    @Override
    public double calculateAtkPercentage() {
        return 0;
    }

    @Override
    public double calculateMatkPercentage() {
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
}

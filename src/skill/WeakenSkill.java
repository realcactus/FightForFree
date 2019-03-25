package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 削弱技能
 */
public abstract class WeakenSkill implements ISkill {
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

}

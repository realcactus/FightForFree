package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 这里采取一种设计就是用一个抽象类，实现具体类【不需要】实现的接口
 */
public abstract class DamageSkill implements ISkill {

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
}

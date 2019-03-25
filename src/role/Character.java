package role;

/**
 * 人物角色抽象类
 */

/**
 * 它有一些普通Target没有的属性，比如等级，经验值，金钱。
 */
public abstract class Character extends Target {
    protected int level;
    protected int experience;
    protected int money;

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }


    public int getMoney() {
        return money;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

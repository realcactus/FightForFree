package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 怪物类，继承自Target
 * 这里有个难度属性，只分三种
 */
public abstract class Monster extends Target {
    protected int difficulty;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "difficulty=" + difficulty +
                ", hp=" + hp +
                ", mp=" + mp +
                ", physicalAtk=" + physicalAtk +
                ", magicalAtk=" + magicalAtk +
                ", physicalDef=" + physicalDef +
                ", magicalDef=" + magicalDef +
                ", critRate=" + critRate +
                '}';
    }
}

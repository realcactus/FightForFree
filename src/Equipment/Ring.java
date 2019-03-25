package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 戒指
 */
public abstract class Ring implements IEquip {
    //暴击率
    protected double critRate;
    //加蓝
    protected int mp;

    public double getCritRate() {
        return critRate;
    }

    public void setCritRate(double critRate) {
        this.critRate = critRate;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}

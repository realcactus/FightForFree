package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 武器
 */
public abstract class Weapon implements IEquip{
    //物理攻击力
    protected int physicalAtk;
    //魔法攻击力
    protected int magicalAtk;

    public int getPhysicalAtk() {
        return physicalAtk;
    }

    public void setPhysicalAtk(int physicalAtk) {
        this.physicalAtk = physicalAtk;
    }

    public int getMagicalAtk() {
        return magicalAtk;
    }

    public void setMagicalAtk(int magicalAtk) {
        this.magicalAtk = magicalAtk;
    }
}

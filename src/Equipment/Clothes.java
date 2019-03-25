package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 衣服
 */
public abstract class Clothes implements IEquip{
    //气血
    protected int hp;
    //物理防御
    protected int physicalDef;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPhysicalDef() {
        return physicalDef;
    }

    public void setPhysicalDef(int physicalDef) {
        this.physicalDef = physicalDef;
    }
}

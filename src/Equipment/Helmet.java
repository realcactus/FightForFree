package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 头盔
 */
public abstract class Helmet implements IEquip{
    //增加气血
    protected int hp;
    //增加魔法防御
    protected int magicalDef;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMagicalDef() {
        return magicalDef;
    }

    public void setMagicalDef(int magicalDef) {
        this.magicalDef = magicalDef;
    }
}

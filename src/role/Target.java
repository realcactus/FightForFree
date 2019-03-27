package role;

import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 可选目标类，可选目标包含角色、怪物，他们有相同的部分
 */
public abstract class Target implements Atkable{
    //气血值
    protected int hp;
    //魔法值
    protected int mp;
    //物理攻击力
    protected int physicalAtk;
    //魔法攻击力
    protected int magicalAtk;
    //物理防御力
    protected int physicalDef;
    //魔法防御力
    protected int magicalDef;
    //暴击率，计算的时候会随即生成0-1的数值，当生成的数值小于critRate时即产生暴击，攻击伤害*2
    protected double critRate;

    public int getHp() {
        return hp;
    }


    public int getMp() {
        return mp;
    }


    public int getPhysicalAtk() {
        return physicalAtk;
    }


    public int getMagicalAtk() {
        return magicalAtk;
    }

    public int getPhysicalDef() {
        return physicalDef;
    }


    public int getMagicalDef() {
        return magicalDef;
    }

    public double getCritRate() {
        return critRate;
    }

    public abstract void show();

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setPhysicalAtk(int physicalAtk) {
        this.physicalAtk = physicalAtk;
    }

    public void setMagicalAtk(int magicalAtk) {
        this.magicalAtk = magicalAtk;
    }

    public void setPhysicalDef(int physicalDef) {
        this.physicalDef = physicalDef;
    }

    public void setMagicalDef(int magicalDef) {
        this.magicalDef = magicalDef;
    }

    public void setCritRate(double critRate) {
        this.critRate = critRate;
    }

    //物理攻击！一般情况下人物和怪物都能进行物理攻击，人物的物理攻击需要加上装备加成，会在子类重写
    public Map<String, Object> physicalCut(){
        Map<String, Object> result = new HashMap<>();
        result.put(StatusCode.ATK_DAMAGE, this.getPhysicalAtk());
        return result;
    }
}

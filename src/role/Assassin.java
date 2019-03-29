package role;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 刺客
 */
public class Assassin extends Character implements Cloneable {

    private static final long serialVersionUID = 9118752325582798626L;

    public Assassin(Builder builder) {
        this.level = builder.level;
        this.experience = builder.experience;
        this.money = builder.money;
        this.hp = builder.hp;
        this.mp = builder.mp;
        this.physicalAtk = builder.physicalAtk;
        this.magicalAtk = builder.magicalAtk;
        this.physicalDef = builder.physicalDef;
        this.magicalDef = builder.magicalDef;
        this.critRate = builder.critRate;
    }

    @Override
    public void show() {
        System.out.println("I am a Assassin");
        System.out.println(toString());
    }


    public static final class Builder extends AbstractCharacterBuilder{
        @Override
        public Target build() {
            return new Assassin(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 升级方法
     */
    @Override
    public int checkLevelUp() {
        int needExp = this.experienceTable[this.level];
        if(this.experience >= needExp){
            this.experience -= needExp;
            this.level += 1;
            //为什么要下放到这里写，因为每一个职业升级所加的数值是不一样的
            this.hp += 50;
            this.mp += 50;
            this.physicalAtk += 50;
            this.physicalDef += 50;
            this.magicalAtk += 20;
            this.magicalDef += 20;
            //刺客升级还能加1%的暴击率
            this.critRate += 0.01;
            return 0;
        }
        return -1;
    }
}

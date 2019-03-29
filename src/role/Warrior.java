package role;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 战士
 */
public class Warrior extends Character implements Cloneable{

    private static final long serialVersionUID = -4896701614866114865L;

    private Warrior(Builder builder){
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
        System.out.println("I am a warrior");
        System.out.println(toString());
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
            this.hp += 100;
            this.mp += 100;
            this.physicalAtk += 100;
            this.physicalDef += 100;
            this.magicalAtk += 20;
            this.magicalDef += 20;
            return 0;
        }
        return -1;
    }

    public static final class Builder extends AbstractCharacterBuilder{
        @Override
        public Target build() {
            return new Warrior(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package role;

/**
 * 魔法师
 */
public class Magician extends Character implements Cloneable{

    private Magician(Builder builder){
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
        System.out.println("I am a magician");
        System.out.println(toString());
    }
    public static final class Builder extends AbstractCharacterBuilder{

        @Override
        public Target build() {
            return new Magician(this);
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "level=" + level +
                ", experience=" + experience +
                ", money=" + money +
                ", hp=" + hp +
                ", mp=" + mp +
                ", physicalAtk=" + physicalAtk +
                ", magicalAtk=" + magicalAtk +
                ", physicalDef=" + physicalDef +
                ", magicalDef=" + magicalDef +
                ", critRate=" + critRate +
                '}';
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
            this.hp += 80;
            this.mp += 80;
            this.physicalAtk += 20;
            this.physicalDef += 20;
            this.magicalAtk += 110;
            this.magicalDef += 110;
            return 0;
        }
        return -1;
    }
}
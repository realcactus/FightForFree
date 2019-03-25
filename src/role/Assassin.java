package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 刺客
 */
public class Assassin extends Character implements Cloneable {

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

    @Override
    public String toString() {
        return "Assassin{" +
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
}

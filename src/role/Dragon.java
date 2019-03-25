package role;

/**
 * @Author: Zhou Xiaosong
 */
public class Dragon extends Target implements Cloneable{

    public Dragon(Builder builder){
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
        System.out.println("I am a dragon!!!!!");
        System.out.println(toString());
    }
    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Dragon(this);
        }
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "hp=" + hp +
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
}

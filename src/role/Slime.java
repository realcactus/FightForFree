package role;

/**
 * @Author: Zhou Xiaosong
 */
public class Slime extends Target implements Cloneable, Atkable{
    private Slime(Builder builder){
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
        System.out.println("I am a Slime!!! wa!!!!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Slime{" +
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
    public int physicalCut() {
        //TODO:史莱姆目前只定义物理攻击atk
        return this.getPhysicalAtk();
    }

    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Slime(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 精灵
 */
public class Elf extends Target implements Cloneable, Atkable{
    private Elf(Builder builder){
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
        System.out.println("I am a elf!!!!!!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Elf{" +
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
        //TODO：精灵目前只定义物理攻击
        return this.getPhysicalAtk();
    }

    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Elf(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

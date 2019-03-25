package role;

/**
 * @Author: Zhou Xiaosong
 */
public abstract class AbstractMonsterBuilder implements TargetBuilder {

    protected int hp;
    protected int mp;
    protected int physicalAtk;
    protected int magicalAtk;
    protected int physicalDef;
    protected int magicalDef;
    protected double critRate;

    @Override
    public AbstractMonsterBuilder hp(int hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public AbstractMonsterBuilder mp(int mp) {
        this.mp = mp;
        return this;
    }

    @Override
    public AbstractMonsterBuilder physicalAtk(int physicalAtk) {
        this.physicalAtk = physicalAtk;
        return this;
    }

    @Override
    public AbstractMonsterBuilder magicalAtk(int magicalAtk) {
        this.magicalAtk = magicalAtk;
        return this;
    }

    @Override
    public AbstractMonsterBuilder physicalDef(int physicalDef) {
        this.physicalDef = physicalDef;
        return this;
    }

    @Override
    public AbstractMonsterBuilder magicalDef(int magicalDef) {
        this.magicalDef = magicalDef;
        return this;
    }

    @Override
    public AbstractMonsterBuilder critRate(double critRate) {
        this.critRate = critRate;
        return this;
    }

}

package role;

/**
 * @Author: Zhou Xiaosong
 */
public abstract class AbstractCharacterBuilder implements CharacterBuilder{
    protected int level;
    protected int experience;
    protected int money;
    protected int hp;
    protected int mp;
    protected int physicalAtk;
    protected int magicalAtk;
    protected int physicalDef;
    protected int magicalDef;
    protected double critRate;

    @Override
    public AbstractCharacterBuilder level(int level) {
        this.level = level;
        return this;
    }

    @Override
    public AbstractCharacterBuilder experience(int experience) {
        this.experience = experience;
        return this;
    }

    @Override
    public AbstractCharacterBuilder money(int money) {
        this.money = money;
        return this;
    }

    @Override
    public AbstractCharacterBuilder hp(int hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public AbstractCharacterBuilder mp(int mp) {
        this.mp = mp;
        return this;
    }

    @Override
    public AbstractCharacterBuilder physicalAtk(int physicalAtk) {
        this.physicalAtk = physicalAtk;
        return this;
    }

    @Override
    public AbstractCharacterBuilder magicalAtk(int magicalAtk) {
        this.magicalAtk = magicalAtk;
        return this;
    }

    @Override
    public AbstractCharacterBuilder physicalDef(int physicalDef) {
        this.physicalDef = physicalDef;
        return this;
    }

    @Override
    public AbstractCharacterBuilder magicalDef(int magicalDef) {
        this.magicalDef = magicalDef;
        return this;
    }

    @Override
    public AbstractCharacterBuilder critRate(double critRate) {
        this.critRate = critRate;
        return this;
    }
}

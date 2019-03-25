package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 初识之衣
 */
public class BeginnerClothes extends Clothes{
    public BeginnerClothes() {
        this.hp = 100;
        this.physicalDef = 50;
    }

    @Override
    public int calculateHp() {
        return this.hp;
    }

    @Override
    public int calculateMp() {
        return 0;
    }

    @Override
    public int calculatePhysicalAtk() {
        return 0;
    }

    @Override
    public int calculateMagicalAtk() {
        return 0;
    }

    @Override
    public int calculatePhysicalDef() {
        return this.physicalDef;
    }

    @Override
    public int calculateMagicalDef() {
        return 0;
    }

    @Override
    public double calculateCritRate() {
        return 0;
    }

    @Override
    public double calculateBloodSucking() {
        return 0;
    }

    @Override
    public String description() {
        return "初识之衣";
    }
}

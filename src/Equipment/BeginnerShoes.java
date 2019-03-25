package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 初识之鞋
 */
public class BeginnerShoes extends Shoes {
    public BeginnerShoes() {
        this.hp = 200;
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
        return 0;
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
        return "初识之鞋";
    }
}

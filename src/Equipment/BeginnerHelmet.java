package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 初识头盔
 */
public class BeginnerHelmet extends Helmet{
    public BeginnerHelmet() {
        this.hp = 100;
        this.magicalDef = 50;
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
        return this.magicalDef;
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
        return "初识头盔";
    }
}

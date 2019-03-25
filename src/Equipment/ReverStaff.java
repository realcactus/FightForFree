package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 回响法杖
 */
public class ReverStaff extends Weapon {
    public ReverStaff() {
        this.physicalAtk = 20;
        this.magicalAtk = 100;
    }

    @Override
    public int calculateHp() {
        return 0;
    }

    @Override
    public int calculateMp() {
        return 0;
    }

    @Override
    public int calculatePhysicalAtk() {
        return this.physicalAtk;
    }

    @Override
    public int calculateMagicalAtk() {
        return this.magicalAtk;
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
        return "回响法杖";
    }
}

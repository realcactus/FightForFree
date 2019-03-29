package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 回响法杖
 */
public class ReverStaff extends Weapon implements Serializable {
    private static final long serialVersionUID = -5352062255989628376L;

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
    public int calculateSellMoney() {
        return 3000;
    }

    @Override
    public String description() {
        return "回响法杖";
    }
}

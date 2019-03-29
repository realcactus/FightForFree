package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 巨人之斧
 */
public class GiantAxe extends Weapon implements Serializable {
    private static final long serialVersionUID = 849020215134598222L;

    public GiantAxe() {
        this.physicalAtk = 100;
        this.magicalAtk = 50;
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
        return "巨人之斧";
    }
}

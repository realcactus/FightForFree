package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 初识之戒
 */
public class BeginnerRing extends Ring implements Serializable {
    private static final long serialVersionUID = 3990986553602066302L;
    //另外初识之戒还有1%的吸血
    private double bloodSuck = 0.01;
    public BeginnerRing() {
        this.mp = 100;
        this.critRate = 0.05;
    }

    @Override
    public int calculateHp() {
        return 0;
    }

    @Override
    public int calculateMp() {
        return this.mp;
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
        return this.critRate;
    }

    @Override
    public double calculateBloodSucking() {
        return this.bloodSuck;
    }

    @Override
    public int calculateSellMoney() {
        return 1500;
    }

    @Override
    public String description() {
        return "初识之戒";
    }

    @Override
    public String toString() {
        return "BeginnerRing{" +
                "bloodSuck=" + bloodSuck +
                ", critRate=" + critRate +
                ", mp=" + mp +
                '}';
    }
}

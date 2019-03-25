package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 初识之戒
 */
public class BeginnerRing extends Ring{
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
    public String description() {
        return "初识之戒";
    }
}

package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 隐秘之剑
 * 除了攻击之外，还附加百分之10的暴击率
 */
public class SecretSword extends Weapon {
    //自带暴击率0.1
    private double critRate = 0.1;
    public SecretSword(){
        this.physicalAtk = 50;
        this.magicalAtk = 20;
    }

    @Override
    public String toString() {
        return "SecretSword{" +
                "critRate=" + critRate +
                ", physicalAtk=" + physicalAtk +
                ", magicalAtk=" + magicalAtk +
                '}';
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
        return this.critRate;
    }

    @Override
    public double calculateBloodSucking() {
        return 0;
    }

    @Override
    public String description() {
        return "隐秘之剑";
    }


}

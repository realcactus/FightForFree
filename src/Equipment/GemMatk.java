package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 舍利子，增加装备20点魔法攻击力
 */
public class GemMatk implements IEquipDecorator {
    //维护一个装备对象
    private IEquip equip;

    public GemMatk(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateHp() {
        return equip.calculateHp();
    }

    @Override
    public int calculateMp() {
        return equip.calculateMp();
    }

    @Override
    public int calculatePhysicalAtk() {
        return equip.calculatePhysicalAtk();
    }

    @Override
    public int calculateMagicalAtk() {
        return equip.calculateMagicalAtk() + 20;
    }

    @Override
    public int calculatePhysicalDef() {
        return equip.calculatePhysicalDef();
    }

    @Override
    public int calculateMagicalDef() {
        return equip.calculateMagicalDef();
    }

    @Override
    public double calculateCritRate() {
        return equip.calculateCritRate();
    }

    @Override
    public double calculateBloodSucking() {
        return equip.calculateBloodSucking();
    }

    @Override
    public int calculateSellMoney() {
        return equip.calculateSellMoney() + 1000;
    }

    @Override
    public String description() {
        return equip.description()+"+舍利子";
    }
}

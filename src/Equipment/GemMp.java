package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 蓝宝石，增加装备50点魔法
 */
public class GemMp implements IEquipDecorator {
    //维护一个装备对象
    private IEquip equip;

    public GemMp(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateHp() {
        return equip.calculateHp();
    }

    @Override
    public int calculateMp() {
        return equip.calculateMp()+50;
    }

    @Override
    public int calculatePhysicalAtk() {
        return equip.calculatePhysicalAtk();
    }

    @Override
    public int calculateMagicalAtk() {
        return equip.calculateMagicalAtk();
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
        return equip.calculateSellMoney() + 500;
    }

    @Override
    public String description() {
        return equip.description()+"+蓝宝石";
    }
}

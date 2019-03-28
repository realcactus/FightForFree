package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 光芒石，增加装备50点气血
 */
public class GemHp implements IEquipDecorator{
    //维护一个装备对象
    private IEquip equip;

    public GemHp(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateHp() {
        return equip.calculateHp() + 50;
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
        return equip.description()+"+光芒石";
    }
}

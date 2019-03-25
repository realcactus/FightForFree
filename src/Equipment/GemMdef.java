package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 翡翠石，增加法术防御20
 */
public class GemMdef implements IEquipDecorator{
    //维护一个装备对象
    private IEquip equip;

    public GemMdef(IEquip equip) {
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
        return equip.calculateMagicalAtk();
    }

    @Override
    public int calculatePhysicalDef() {
        return equip.calculatePhysicalDef();
    }

    @Override
    public int calculateMagicalDef() {
        return equip.calculateMagicalDef() + 20;
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
    public String description() {
        return equip.description()+"+翡翠石";
    }
}

package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 翡翠石，增加法术防御20
 */
public class GemMdef implements IEquipDecorator, Serializable {
    private static final long serialVersionUID = -7541392853799233101L;
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
    public int calculateSellMoney() {
        return equip.calculateMagicalDef() + 700;
    }

    @Override
    public String description() {
        return equip.description()+"+翡翠石";
    }
}

package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 初识之鞋
 */
public class BeginnerShoes extends Shoes implements Serializable {
    private static final long serialVersionUID = -7567597264127249368L;

    public BeginnerShoes() {
        this.hp = 200;
    }

    @Override
    public int calculateHp() {
        return this.hp;
    }

    @Override
    public int calculateMp() {
        return 0;
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
        return 0;
    }

    @Override
    public double calculateBloodSucking() {
        return 0;
    }

    @Override
    public int calculateSellMoney() {
        return 1500;
    }

    @Override
    public String description() {
        return "初识之鞋";
    }

    @Override
    public String toString() {
        return "BeginnerShoes{" +
                "hp=" + hp +
                '}';
    }
}

package Equipment;

/**
 * @Author: Zhou Xiaosong
 */

import java.io.Serializable;

/**
 * 初识头盔
 */
public class BeginnerHelmet extends Helmet implements Serializable {
    private static final long serialVersionUID = 6991756654585570829L;

    public BeginnerHelmet() {
        this.hp = 100;
        this.magicalDef = 50;
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
        return this.magicalDef;
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
        return "初识头盔";
    }

    @Override
    public String toString() {
        return "BeginnerHelmet{" +
                "hp=" + hp +
                ", magicalDef=" + magicalDef +
                '}';
    }
}

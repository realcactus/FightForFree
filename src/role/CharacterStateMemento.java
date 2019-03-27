package role;

import Equipment.IEquip;
import skill.ISkill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * Character备忘录
 * 这里这个备忘录其实不仅仅是为了给在战斗中死亡的角色复活
 * 还有一个功能就是产生一个被装备包裹属性后的对象
 * 具体来说就是对象先根据身上穿的装备重新设置自身的属性
 * 战斗结束后恢复原来的状态
 * 当然这里也可以用装饰者模式来实现，但选择了更直观的备忘录模式
 */
public class CharacterStateMemento extends Target{

    //只需要记录需要恢复的状态
    protected double bloodSucking;
    //除此之外，它还有Target类本身就具有的属性
    //int hp
    //int mp
    //int physicalAtk
    //int magicalAtk
    //int physicalDef
    //int magicalDef
    //double critRate


    public CharacterStateMemento(int hp, int mp,
                                 int physicalAtk, int magicalAtk, int physicalDef,
                                 int magicalDef, double critRate, double bloodSucking) {
        this.bloodSucking = bloodSucking;
        this.hp = hp;
        this.mp = mp;
        this.physicalAtk = physicalAtk;
        this.magicalAtk = magicalAtk;
        this.physicalDef = physicalDef;
        this.magicalDef = magicalDef;
        this.critRate = critRate;
    }

    @Override
    public void show() {
        System.out.println("I am a backup for original character!!");
    }

    public double getBloodSucking() {
        return bloodSucking;
    }

    public void setBloodSucking(double bloodSucking) {
        this.bloodSucking = bloodSucking;
    }
}

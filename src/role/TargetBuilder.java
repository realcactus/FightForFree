package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * Target超类的建造者
 */
public interface TargetBuilder{
    //气血值
    TargetBuilder hp(int hp);
    //魔法值
    TargetBuilder mp(int mp);
    //物理攻击力
    TargetBuilder physicalAtk(int physicalAtk);
    //魔法攻击力
    TargetBuilder magicalAtk(int magicalAtk);
    //物理防御力
    TargetBuilder physicalDef(int physicalDef);
    //魔法防御力
    TargetBuilder magicalDef(int magicalDef);
    //暴击率，计算的时候会随即生成0-1的数值，当生成的数值小于critRate时即产生暴击，攻击伤害*2
    TargetBuilder critRate(double critRate);

    Target build();
}

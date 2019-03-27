package utils;

/**
 * @Author: Zhou Xiaosong
 */
public class StatusCode {
    public static String ADD_HP = "addHpForMe";
    public static String ADD_MP = "addMPForMe";
    public static String ADD_PDEF = "addPhysicalDefForMe";
    public static String ADD_MDEF = "addMagicalDefForMe";
    public static String ADD_CRIT = "addCritRateForMe";
    public static String ADD_ATK = "addAtkForMe";
    public static String ADD_MATK = "addMatkForMe";
    public static String ADD_S_BLOOD = "addSuckBloodForMe";

    //这里是先返回一个的物理伤害，然后在战斗业务上根据怪物的物理防御计算怪物的状态更新
    public static String ATK_DAMAGE = "atkDamageForMonsterToCalculate";
    //这里是先返回一个魔法伤害，然后在战斗业务上根据怪物的魔法防御计算怪物的状态更新
    public static String MATK_DAMAGE = "matkDamageForMonsterToCalculate";

    public static String SUB_PDEF = "decreasePhysicalDefForMonster";
    public static String SUB_MDEF = "decreaseMagicalDefForMonster";


}

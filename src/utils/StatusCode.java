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


    //这部分是战斗状态
    public static String CHARACTER_STEP = "characterStepToExecute";
    public static String MONSTER_STEP = "monsterStepToExecute";
    public static String FIGHT_FINISH = "fightIsFinished";
    public static String CHARACTER_DIE = "characterIsDied";

    //掉落物品
    public static String DROP_ITEM = "fightDropItem";
    public static String DROP_EXP = "dropExperiment";
    public static String DROP_MONEY = "dropMoney";

    //怪物难度对应
    public static int MONSTER_SIMPLE = 0;
    public static int MONSTER_NORMAL = 1;
    public static int MONSTER_HARD = 2;
}

package Equipment;

/**
 * @Author: Zhou Xiaosong
 */
public interface IEquip {
    /**
     * 计算各个属性，这里逻辑是人物所有的一些属性装备都可以增加，还有一个人物所没有的：吸血
     *
     */
    int calculateHp();
    int calculateMp();
    int calculatePhysicalAtk();
    int calculateMagicalAtk();
    int calculatePhysicalDef();
    int calculateMagicalDef();
    double calculateCritRate();
    //吸血
    double calculateBloodSucking();

    /**
     * 装备描述
     */
    String description();

}

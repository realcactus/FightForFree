package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 怪物抽象工厂
 */
public interface MonsterFactory {
    //史莱姆
    Slime createSlime();
    //精灵
    Elf createElf();
    //龙
    Dragon createDragon();
}

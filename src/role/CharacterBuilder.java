package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 人物角色的建造者，因为是人物角色，还有一些怪物所没有的属性，比如等级，经验值，金钱。
 */
public interface CharacterBuilder extends TargetBuilder {
    CharacterBuilder level(int level);
    CharacterBuilder experience(int experience);
    CharacterBuilder money(int money);
}

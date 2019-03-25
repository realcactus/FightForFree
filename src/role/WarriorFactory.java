package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 战士工厂
 */
public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return (Character) new Warrior.Builder().hp(1000).mp(200)
                .physicalAtk(100).physicalDef(100)
                .magicalAtk(20).magicalDef(50)
                .critRate(0.0).money(10000)
                .level(0).experience(0)
                .build();
    }
}

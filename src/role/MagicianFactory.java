package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 魔法师工厂
 */
public class MagicianFactory implements CharacterFactory {
    @Override
    public Magician createCharacter() {
        return (Magician) new Magician.Builder().hp(800).mp(500)
                .physicalAtk(20).physicalDef(50)
                .magicalAtk(100).magicalDef(100)
                .critRate(0.0).money(10000)
                .level(0).experience(0)
                .build();
    }
}

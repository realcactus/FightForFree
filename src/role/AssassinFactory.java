package role;

/**
 * @Author: Zhou Xiaosong
 */
public class AssassinFactory implements CharacterFactory  {
    @Override
    public Character createCharacter() {
        return (Character) new Assassin.Builder().hp(600).mp(300)
                .physicalAtk(70).physicalDef(70)
                .magicalAtk(20).magicalDef(50)
                .critRate(0.3).money(10000)
                .level(0).experience(0)
                .build();
    }
}

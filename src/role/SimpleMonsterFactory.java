package role;

/**
 * @Author: Zhou Xiaosong
 */
public class SimpleMonsterFactory implements MonsterFactory {
    @Override
    public Slime createSlime() {
        return (Slime) new Slime.Builder().hp(100).mp(50)
                .physicalAtk(20).physicalDef(20)
                .magicalAtk(0).magicalDef(20)
                .critRate(0.0).build();
    }

    @Override
    public Elf createElf() {
        return (Elf) new Elf.Builder().hp(200).mp(150)
                .physicalAtk(10).physicalDef(20)
                .magicalAtk(40).magicalDef(40)
                .critRate(0.0).build();
    }

    @Override
    public Dragon createDragon() {
        return (Dragon) new Dragon.Builder().hp(500).mp(500)
                .physicalAtk(100).physicalDef(100)
                .magicalAtk(100).magicalDef(100)
                .critRate(0.1).build();
    }
}

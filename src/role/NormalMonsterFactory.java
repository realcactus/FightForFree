package role;

/**
 * @Author: Zhou Xiaosong
 */
public class NormalMonsterFactory implements MonsterFactory {
    @Override
    public Slime createSlime() {
        return (Slime) new Slime.Builder().hp(1000).mp(500)
                .physicalAtk(200).physicalDef(200)
                .magicalAtk(100).magicalDef(200)
                .critRate(0.0).build();
    }

    @Override
    public Elf createElf() {
        return (Elf) new Elf.Builder().hp(2000).mp(1500)
                .physicalAtk(100).physicalDef(200)
                .magicalAtk(400).magicalDef(400)
                .critRate(0.0).build();
    }

    @Override
    public Dragon createDragon() {
        return (Dragon) new Dragon.Builder().hp(5000).mp(5000)
                .physicalAtk(1000).physicalDef(1000)
                .magicalAtk(1000).magicalDef(1000)
                .critRate(0.1).build();
    }
}

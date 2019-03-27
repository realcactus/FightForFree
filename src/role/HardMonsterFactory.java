package role;

import utils.StatusCode;

/**
 * @Author: Zhou Xiaosong
 */
public class HardMonsterFactory implements MonsterFactory {
    @Override
    public Slime createSlime() {
        return (Slime) new Slime.Builder().hp(10000).mp(5000)
                .physicalAtk(2000).physicalDef(2000)
                .magicalAtk(1000).magicalDef(2000)
                .critRate(0.0).difficulty(StatusCode.MONSTER_HARD)
                .build();
    }

    @Override
    public Elf createElf() {
        return (Elf) new Elf.Builder().hp(20000).mp(15000)
                .physicalAtk(1000).physicalDef(2000)
                .magicalAtk(4000).magicalDef(4000)
                .critRate(0.0).difficulty(StatusCode.MONSTER_HARD)
                .build();
    }

    @Override
    public Dragon createDragon() {
        return (Dragon) new Dragon.Builder().hp(50000).mp(50000)
                .physicalAtk(10000).physicalDef(10000)
                .magicalAtk(10000).magicalDef(10000)
                .critRate(0.3).difficulty(StatusCode.MONSTER_HARD)
                .build();
    }
}

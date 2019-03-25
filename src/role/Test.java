package role;

/**
 * @Author: Zhou Xiaosong
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        Character character1 = new WarriorFactory().createCharacter();
//        character1.show();
//        System.out.println(character1.getClass().getName());
//        Character character2 = new MagicianFactory().createCharacter();
//        character2.show();
//        System.out.println(character2.getClass().getName());
//        Character character3 = new AssassinFactory().createCharacter();
//        character3.show();
//        System.out.println(character3.getClass().getName());
        Target target1 = new NormalMonsterFactory().createSlime();
        target1.show();
        System.out.println(target1.getClass().getName());
        Target target1_clone = (Target) ((Slime) target1).clone();
        target1_clone.setHp(1);
        target1_clone.show();
        System.out.println(target1_clone.getClass().getName());
//        Target target2 = new NormalMonsterFactory().createElf();
//        target2.show();
//        System.out.println(target2.getClass().getName());
//        Target target3 = new NormalMonsterFactory().createDragon();
//        target3.show();
//        System.out.println(target3.getClass().getName());
    }
}

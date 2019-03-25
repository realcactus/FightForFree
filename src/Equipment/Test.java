package Equipment;

/**
 * @Author: Zhou Xiaosong
 */
public class Test {
    public static void show(IEquip sword){
        System.out.println("****************************************************************");
        System.out.println(sword.description());
        System.out.println("Hp:" + sword.calculateHp());
        System.out.println("Mp:" + sword.calculateMp());
        System.out.println("物理攻击:" + sword.calculatePhysicalAtk());
        System.out.println("物理防御:" + sword.calculatePhysicalDef());
        System.out.println("法术攻击:" + sword.calculateMagicalAtk());
        System.out.println("法术防御:" + sword.calculateMagicalDef());
        System.out.println("暴击率:" + sword.calculateCritRate());
        System.out.println("吸血率:" + sword.calculateBloodSucking());
        System.out.println("****************************************************************");
    }
    public static void main(String[] args){
        IEquip sword = new SecretSword();
        show(sword);
        System.out.println("打宝石");
        sword = new GemMp(sword);
        sword = new GemHp(sword);
        sword = new GemMatk(sword);
        sword = new GemPatk(sword);
        sword = new GemPdef(sword);
        sword = new GemMdef(sword);
        show(sword);

    }


}

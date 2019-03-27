package role;

/**
 * @Author: Zhou Xiaosong
 */

import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 精灵
 */
public class Elf extends Monster implements Cloneable, Atkable{
    private Elf(Builder builder){
        this.hp = builder.hp;
        this.mp = builder.mp;
        this.physicalAtk = builder.physicalAtk;
        this.magicalAtk = builder.magicalAtk;
        this.physicalDef = builder.physicalDef;
        this.magicalDef = builder.magicalDef;
        this.critRate = builder.critRate;
        this.difficulty = builder.difficulty;
    }
    @Override
    public void show() {
        System.out.println("I am a elf!!!!!!");
        System.out.println(toString());
    }

    @Override
    public Map<String, Object> physicalCut() {
        //TODO：精灵目前只定义物理攻击
        Map<String, Object> result = new HashMap<>();
        result.put(StatusCode.ATK_DAMAGE, this.getPhysicalAtk());
        return result;
    }

    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Elf(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

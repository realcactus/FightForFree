package role;

import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhou Xiaosong
 */
public class Slime extends Monster implements Cloneable, Atkable{
    private Slime(Builder builder){
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
        System.out.println("I am a Slime!!! wa!!!!");
        System.out.println(toString());
    }

    @Override
    public Map<String, Object> physicalCut() {
        //TODO:史莱姆目前只定义物理攻击atk
        Map<String, Object> result = new HashMap<>();
        result.put(StatusCode.ATK_DAMAGE, this.getPhysicalAtk());
        return result;
    }

    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Slime(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

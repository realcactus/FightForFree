package role;

import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhou Xiaosong
 */
public class Dragon extends Monster implements Cloneable, Atkable{

    public Dragon(Builder builder){
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
        System.out.println("I am a dragon!!!!!");
        System.out.println(toString());
    }

    @Override
    public Map<String, Object> physicalCut() {
        //TODO:龙目前只定义物理攻击
        Map<String, Object> result = new HashMap<>();
        result.put(StatusCode.ATK_DAMAGE, this.getPhysicalAtk());
        return result;
    }

    public static final class Builder extends AbstractMonsterBuilder{

        @Override
        public Target build() {
            return new Dragon(this);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package role;

/**
 * 人物角色抽象类
 */

import Equipment.*;
import interaction.ExcuteSkillAdapter;
import interaction.Skillable;
import skill.ISkill;
import utils.StatusCode;

import java.util.List;
import java.util.Map;

/**
 * 它有一些普通Target没有的属性，比如等级，经验值，金钱。
 */

//基本角色最多携带4个技能，后面扩展可能会有能携带多个技能的角色
public abstract class Character extends Target implements Atkable{
    protected int level;
    protected int experience;
    protected int money;

    public double getBloodSucking() {
        return bloodSucking;
    }

    public void setBloodSucking(double bloodSucking) {
        this.bloodSucking = bloodSucking;
    }

    //隐藏属性
    protected double bloodSucking = 0.0;

    //桥接一身的装备
    //头盔
    protected Helmet helmet;
    //衣服
    protected Clothes clothes;
    //鞋子
    protected Shoes shoes;
    //武器
    protected Weapon weapon;
    //戒指
    protected Ring ring;

    //桥接的4个技能抽象
    protected ISkill skill1;
    protected ISkill skill2;
    protected ISkill skill3;
    protected ISkill skill4;

    //释放单个技能，返回状态集合
    public Map<String,Object> excuteSkill(Character character, ISkill skill){
        Skillable skillable = new ExcuteSkillAdapter(skill);
        return skillable.excuteSkill(this);
    }

    //物理攻击！
    public int physicalCut(){
        //返回物理攻击产生的数值
        int physicalAtk = this.getPhysicalAtk();
        //物理攻击
        int physicalAtkAppend = this.getHelmet().calculatePhysicalAtk()
                +this.getClothes().calculatePhysicalAtk()
                +this.getShoes().calculatePhysicalAtk()
                +this.getWeapon().calculatePhysicalAtk()
                +this.getRing().calculatePhysicalAtk();
        physicalAtk += physicalAtkAppend;
        return physicalAtk;
    }

    //根据状态集合更新状态
    public void updateStatus(Map<String,Object> values){
        //攻击增加
        if(values.containsKey(StatusCode.ADD_ATK)) {
            int atk = (Integer) (values.get(StatusCode.ADD_ATK));
            if(atk>0){
                setPhysicalAtk(this.physicalAtk + atk);
            }
        }
        //魔法攻击增加
        if(values.containsKey(StatusCode.ADD_MATK)){
            int matk = (Integer)(values.get(StatusCode.ADD_MATK));
            if(matk > 0){
                setMagicalAtk(this.magicalAtk + matk);
            }
        }
        //增加防御
        if(values.containsKey(StatusCode.ADD_PDEF)){
            int def = (Integer)(values.get(StatusCode.ADD_PDEF));
            if(def > 0){
                setPhysicalDef(this.physicalDef + def);
            }
        }
        //增加魔法防御
        if(values.containsKey(StatusCode.ADD_MDEF)){
            int mdef = (Integer)(values.get(StatusCode.ADD_MDEF));
            if(mdef > 0){
                setMagicalDef(this.magicalDef + mdef);
            }
        }
        //回复气血
        if(values.containsKey(StatusCode.ADD_HP)){
            int hp = (Integer)(values.get(StatusCode.ADD_HP));
            if (hp > 0){
                setHp(this.hp + hp);
            }
        }
        //回复蓝
        if(values.containsKey(StatusCode.ADD_MP)){
            int mp = (Integer)(values.get(StatusCode.ADD_MP));
            if (mp > 0){
                setMp(this.mp + mp);
            }
        }
        //增加暴击率
        if(values.containsKey(StatusCode.ADD_CRIT)){
            double critRate = (Integer)(values.get(StatusCode.ADD_CRIT));
            if (critRate > 0){
                setCritRate(this.critRate + critRate);
            }
        }
        //增加吸血率
        if(values.containsKey(StatusCode.ADD_S_BLOOD)){
            double suckBlood = (Integer)(values.get(StatusCode.ADD_S_BLOOD));
            if (suckBlood > 0){
                setBloodSucking(suckBlood);
            }
        }
    }


    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }


    public int getMoney() {
        return money;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Ring getRing() {
        return ring;
    }

    public void setRing(Ring ring) {
        this.ring = ring;
    }

}

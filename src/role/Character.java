package role;

/**
 * 人物角色抽象类
 */

import Equipment.*;
import interaction.ExcuteSkillAdapter;
import interaction.Skillable;
import skill.ISkill;
import utils.StatusCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 它有一些普通Target没有的属性，比如等级，经验值，金钱。
 */

//基本角色最多携带4个技能，后面扩展可能会有能携带多个技能的角色
public abstract class Character extends Target{
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
    protected IEquip helmet;
    //衣服
    protected IEquip clothes;
    //鞋子
    protected IEquip shoes;
    //武器
    protected IEquip weapon;
    //戒指
    protected IEquip ring;

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
    @Override
    public Map<String, Object> physicalCut(){
        Map<String, Object> result = new HashMap<>();
        //返回物理攻击产生的数值
        int physicalAtk = this.getPhysicalAtk();
        //物理攻击
        int physicalAtkAppend = this.getHelmet().calculatePhysicalAtk()
                +this.getClothes().calculatePhysicalAtk()
                +this.getShoes().calculatePhysicalAtk()
                +this.getWeapon().calculatePhysicalAtk()
                +this.getRing().calculatePhysicalAtk();
        physicalAtk += physicalAtkAppend;
        result.put(StatusCode.ATK_DAMAGE, physicalAtk);
        return result;
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
            double critRate = (Double) (values.get(StatusCode.ADD_CRIT));
            if (critRate > 0){
                setCritRate(this.critRate + critRate);
            }
        }
        //增加吸血率
        if(values.containsKey(StatusCode.ADD_S_BLOOD)){
            double suckBlood = (Double)(values.get(StatusCode.ADD_S_BLOOD));
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

    public ISkill getSkill1() {
        return skill1;
    }

    public void setSkill1(ISkill skill1) {
        this.skill1 = skill1;
    }

    public ISkill getSkill2() {
        return skill2;
    }

    public void setSkill2(ISkill skill2) {
        this.skill2 = skill2;
    }

    public ISkill getSkill3() {
        return skill3;
    }

    public void setSkill3(ISkill skill3) {
        this.skill3 = skill3;
    }

    public ISkill getSkill4() {
        return skill4;
    }

    public void setSkill4(ISkill skill4) {
        this.skill4 = skill4;
    }

    public IEquip getHelmet() {
        return helmet;
    }

    public void setHelmet(IEquip helmet) {
        this.helmet = helmet;
    }

    public IEquip getClothes() {
        return clothes;
    }

    public void setClothes(IEquip clothes) {
        this.clothes = clothes;
    }

    public IEquip getShoes() {
        return shoes;
    }

    public void setShoes(IEquip shoes) {
        this.shoes = shoes;
    }

    public IEquip getWeapon() {
        return weapon;
    }

    public void setWeapon(IEquip weapon) {
        this.weapon = weapon;
    }

    public IEquip getRing() {
        return ring;
    }

    public void setRing(IEquip ring) {
        this.ring = ring;
    }

    //这部分是在怪物行动时，计算人物扣血，需要计算人物现有的防御状态
    public int calculatePhysicalDef(){
        int basedPhysicalDef = this.physicalDef;
        basedPhysicalDef += this.helmet.calculatePhysicalDef();
        basedPhysicalDef += this.clothes.calculatePhysicalDef();
        basedPhysicalDef += this.shoes.calculatePhysicalDef();
        basedPhysicalDef += this.weapon.calculatePhysicalDef();
        basedPhysicalDef += this.ring.calculatePhysicalDef();
        return basedPhysicalDef;
    }

}

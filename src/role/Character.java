package role;

/**
 * 人物角色抽象类
 */

import Equipment.*;
import interaction.ExcuteSkillAdapter;
import interaction.Skillable;
import skill.ISkill;
import utils.GameCode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 它有一些普通Target没有的属性，比如等级，经验值，金钱。
 */

//基本角色最多携带4个技能，后面扩展可能会有能携带多个技能的角色
public abstract class Character extends Target{
    protected int level;
    protected int experience;
    protected int money;
    //隐藏属性
    protected double bloodSucking = 0.0;

    //升级表，experienceTable[i]表示从i级升到i+1级需要多少经验，目前最高只有5级
    protected int[] experienceTable = {200,1000,5000,20000,100000};

    /**
     * 升级方法
     * @return 返回0，则升级成功。返回-1，则经验不足。
     */
    public abstract int checkLevelUp();

    public double getBloodSucking() {
        return bloodSucking;
    }

    public void setBloodSucking(double bloodSucking) {
        this.bloodSucking = bloodSucking;
    }



    protected String nickName;

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

    //TODO:角色背包实际上应该能放装备、药品、技能书、宝石等等，这里逻辑先写装备背包与技能背包
    //装备背包
    protected List<IEquip> equipBag;
    //技能背包
    protected List<ISkill> skillBag;

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
        result.put(GameCode.ATK_DAMAGE, physicalAtk);
        return result;
    }

    //增长经验
    public void increaseExperience(int appendExperience){
        this.experience += appendExperience;
    }

    //增长金钱
    public void increaseMoney(int appendMoney){
        this.money += appendMoney;
    }

    //花钱
    public void spendMoney(int spendMoney){
        this.money -= spendMoney;
    }

    //根据状态集合更新状态
    public void updateStatus(Map<String,Object> values){
        //攻击增加
        if(values.containsKey(GameCode.ADD_ATK)) {
            int atk = (Integer) (values.get(GameCode.ADD_ATK));
            if(atk>0){
                setPhysicalAtk(this.physicalAtk + atk);
            }
        }
        //魔法攻击增加
        if(values.containsKey(GameCode.ADD_MATK)){
            int matk = (Integer)(values.get(GameCode.ADD_MATK));
            if(matk > 0){
                setMagicalAtk(this.magicalAtk + matk);
            }
        }
        //增加防御
        if(values.containsKey(GameCode.ADD_PDEF)){
            int def = (Integer)(values.get(GameCode.ADD_PDEF));
            if(def > 0){
                setPhysicalDef(this.physicalDef + def);
            }
        }
        //增加魔法防御
        if(values.containsKey(GameCode.ADD_MDEF)){
            int mdef = (Integer)(values.get(GameCode.ADD_MDEF));
            if(mdef > 0){
                setMagicalDef(this.magicalDef + mdef);
            }
        }
        //回复气血
        if(values.containsKey(GameCode.ADD_HP)){
            int hp = (Integer)(values.get(GameCode.ADD_HP));
            if (hp > 0){
                setHp(this.hp + hp);
            }
        }
        //回复蓝
        if(values.containsKey(GameCode.ADD_MP)){
            int mp = (Integer)(values.get(GameCode.ADD_MP));
            if (mp > 0){
                setMp(this.mp + mp);
            }
        }
        //增加暴击率
        if(values.containsKey(GameCode.ADD_CRIT)){
            double critRate = (Double) (values.get(GameCode.ADD_CRIT));
            if (critRate > 0){
                setCritRate(this.critRate + critRate);
            }
        }
        //增加吸血率
        if(values.containsKey(GameCode.ADD_S_BLOOD)){
            double suckBlood = (Double)(values.get(GameCode.ADD_S_BLOOD));
            if (suckBlood > 0){
                setBloodSucking(suckBlood);
            }
        }
    }

    //实现备忘录方法
    public CharacterStateMemento saveMemento(){
        return (new CharacterStateMemento(this.hp,this.mp,this.physicalAtk,this.magicalAtk,
                this.physicalDef,this.magicalDef,this.critRate,this.bloodSucking));
    }

    //实现备忘录恢复方法
    public void recover(CharacterStateMemento characterStateMemento){
        this.hp = characterStateMemento.getHp();
        this.mp = characterStateMemento.getMp();
        this.physicalAtk = characterStateMemento.getPhysicalAtk();
        this.magicalAtk = characterStateMemento.getMagicalAtk();
        this.physicalDef = characterStateMemento.getPhysicalDef();
        this.magicalDef = characterStateMemento.getMagicalDef();
        this.critRate = characterStateMemento.getCritRate();
        this.bloodSucking = characterStateMemento.getBloodSucking();
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

    public List<IEquip> getEquipBag() {
        return equipBag;
    }

    public void setEquipBag(List<IEquip> equipBag) {
        this.equipBag = equipBag;
    }

    public List<ISkill> getSkillBag() {
        return skillBag;
    }

    public void setSkillBag(List<ISkill> skillBag) {
        this.skillBag = skillBag;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    //计算人物带上装备后的防御状态
    public int calculatePhysicalDef(){
        int basedPhysicalDef = this.physicalDef;
        basedPhysicalDef += this.helmet.calculatePhysicalDef();
        basedPhysicalDef += this.clothes.calculatePhysicalDef();
        basedPhysicalDef += this.shoes.calculatePhysicalDef();
        basedPhysicalDef += this.weapon.calculatePhysicalDef();
        basedPhysicalDef += this.ring.calculatePhysicalDef();
        return basedPhysicalDef;
    }

    //计算人物在带上装备后的物理攻击力
    public int calculatePhysicalAtk(){
        int basePhysicalAtk = this.physicalAtk;
        basePhysicalAtk += this.helmet.calculatePhysicalAtk();
        basePhysicalAtk += this.clothes.calculatePhysicalAtk();
        basePhysicalAtk += this.shoes.calculatePhysicalAtk();
        basePhysicalAtk += this.weapon.calculatePhysicalAtk();
        basePhysicalAtk += this.ring.calculatePhysicalAtk();
        return basePhysicalAtk;
    }

    //计算人物在带上装备后的法术攻击力
    public int calculateMagicalAtk(){
        int baseMagicalAtk = this.magicalAtk;
        baseMagicalAtk += this.helmet.calculateMagicalAtk();
        baseMagicalAtk += this.clothes.calculateMagicalAtk();
        baseMagicalAtk += this.shoes.calculateMagicalAtk();
        baseMagicalAtk += this.weapon.calculateMagicalAtk();
        baseMagicalAtk += this.ring.calculateMagicalAtk();
        return baseMagicalAtk;
    }

    //计算人物在带上装备后的法术防御
    public int calculateMagicalDef(){
        int baseMagicalDef = this.magicalDef;
        baseMagicalDef += this.helmet.calculateMagicalDef();
        baseMagicalDef += this.clothes.calculateMagicalDef();
        baseMagicalDef += this.shoes.calculateMagicalDef();
        baseMagicalDef += this.weapon.calculateMagicalDef();
        baseMagicalDef += this.ring.calculateMagicalDef();
        return baseMagicalDef;
    }

    //计算人物在带上装备后的气血
    public int calculateHp(){
        int baseHp = this.hp;
        baseHp += this.helmet.calculateHp();
        baseHp += this.clothes.calculateHp();
        baseHp += this.shoes.calculateHp();
        baseHp += this.weapon.calculateHp();
        baseHp += this.ring.calculateHp();
        return baseHp;
    }

    //计算人物在带上装备后的蓝
    public int calculateMp(){
        int baseMp = this.mp;
        baseMp += this.helmet.calculateMp();
        baseMp += this.clothes.calculateMp();
        baseMp += this.shoes.calculateMp();
        baseMp += this.weapon.calculateMp();
        baseMp += this.ring.calculateMp();
        return baseMp;
    }

    //计算人物在带上装备后的暴击率
    public double calculateCritRate(){
        double baseCrit = this.critRate;
        baseCrit += this.helmet.calculateCritRate();
        baseCrit += this.clothes.calculateCritRate();
        baseCrit += this.shoes.calculateCritRate();
        baseCrit += this.weapon.calculateCritRate();
        baseCrit += this.ring.calculateCritRate();
        return baseCrit;
    }

    //计算人物在带上装备后的吸血率
    public double calculateSuckBloodRate(){
        double baseSuckBlood = this.bloodSucking;
        baseSuckBlood += this.helmet.calculateBloodSucking();
        baseSuckBlood += this.clothes.calculateBloodSucking();
        baseSuckBlood += this.shoes.calculateBloodSucking();
        baseSuckBlood += this.weapon.calculateBloodSucking();
        baseSuckBlood += this.ring.calculateBloodSucking();
        return baseSuckBlood;
    }

    @Override
    public String toString() {
        return "Character{" +
                "level=" + level +
                ", experience=" + experience +
                ", money=" + money +
                ", bloodSucking=" + bloodSucking +
                ", experienceTable=" + Arrays.toString(experienceTable) +
                ", nickName='" + nickName + '\'' +
                ", helmet=" + helmet +
                ", clothes=" + clothes +
                ", shoes=" + shoes +
                ", weapon=" + weapon +
                ", ring=" + ring +
                ", skill1=" + skill1 +
                ", skill2=" + skill2 +
                ", skill3=" + skill3 +
                ", skill4=" + skill4 +
                ", equipBag=" + equipBag +
                ", skillBag=" + skillBag +
                ", hp=" + hp +
                ", mp=" + mp +
                ", physicalAtk=" + physicalAtk +
                ", magicalAtk=" + magicalAtk +
                ", physicalDef=" + physicalDef +
                ", magicalDef=" + magicalDef +
                ", critRate=" + critRate +
                '}';
    }

}

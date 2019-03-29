package skill;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 技能 圣光
 */
public class HolyLight extends GainSkill {
    private static final long serialVersionUID = 3922874768682047755L;
    protected int restoreHp;

    //技能升级经验表，最高升到5级
    protected int[] experienceTable = {2000,5000,10000,30000,100000};

    public HolyLight() {
        //初始等级为0
        this.level = 0;
        //1级使用需要Mp = 20
        this.needMp = 20;
        this.restoreHp = 50;
    }

    public int getRestoreHp() {
        return restoreHp;
    }

    public void setRestoreHp(int restoreHp) {
        this.restoreHp = restoreHp;
    }

    @Override
    public void upLevel() {
        switch (this.level){
            case 0:
                setLevel(1);
                setNeedMp(40);
                setRestoreHp(100);
                break;
            case 1:
                setLevel(2);
                setNeedMp(60);
                setRestoreHp(150);
                break;
            case 2:
                setLevel(3);
                setNeedMp(80);
                setRestoreHp(200);
                break;
            case 3:
                setLevel(4);
                setNeedMp(150);
                setRestoreHp(250);
                break;
            case 4:
                setLevel(5);
                setNeedMp(200);
                setRestoreHp(300);
        }
    }

    @Override
    public int getLevelUpNeedMoney() {
        return this.experienceTable[this.level];
    }

    @Override
    public int calculateRestoreHp() {
        return this.restoreHp;
    }

    @Override
    public int calculateIncreasePdef() {
        return 0;
    }

    @Override
    public int calculateIncreaseMdef() {
        return 0;
    }

    @Override
    public String description() {
        return "圣光";
    }

    @Override
    public String toString() {
        return "HolyLight{" +
                "restoreHp=" + restoreHp +
                ", level=" + level +
                ", needMp=" + needMp +
                '}';
    }
}

package view;
import Equipment.IEquip;
import interaction.FightContext;
import interaction.FightState;
import role.Character;
import role.CharacterStateManage;
import role.Monster;
import skill.ISkill;
import utils.GameCode;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FightFrame extends JFrame {

    private JPanel contentPane;

    private JLabel lblNewLabel_1;
    private JLabel lblNull;
    private JLabel lblNull_1;
    private JLabel lblNull_2;
    private Character character;
    private Monster monster;

    private JCheckBox chckbxNewCheckBox;
    private JCheckBox chckbxNewCheckBox_1;
    private JCheckBox checkBox;
    private JCheckBox checkBox_1;
    private JButton btnNewButton;


    FightState state;
    FightContext fightContext;

    int stepNum;
    Map<String, Object> resultValues;
    private CharacterStateManage characterStateManage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FightFrame frame = new FightFrame(null,null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FightFrame(Character character, Monster monster) {

        //在这里生成战斗前的情景
        //在这个地方有个小技巧
        //先用备忘录模式记录下原来的状态，然后用装备信息更新角色信息，进入战斗
        characterStateManage = new CharacterStateManage();
        characterStateManage.setMemento(character.saveMemento());

        //根据装备信息更新角色数值
        character.setHp(character.calculateHp());
        character.setMp(character.calculateMp());
        character.setPhysicalAtk(character.calculatePhysicalAtk());
        character.setMagicalAtk(character.calculateMagicalAtk());
        character.setPhysicalDef(character.calculatePhysicalDef());
        character.setMagicalDef(character.calculateMagicalDef());
        character.setCritRate(character.calculateCritRate());
        character.setBloodSucking(character.calculateSuckBloodRate());

        state = new FightState();
        //初始化角色行动
        state.setValue(GameCode.CHARACTER_STEP);
        fightContext = new FightContext(state);
        stepNum = 1;
        resultValues = new HashMap<>();

        this.character = character;
        this.monster = monster;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 462, 425);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);


        ImageIcon icon = new ImageIcon("resources/pictures/character.jpg");
        //缩放图片
        Image image = icon.getImage();
        Image smallImage = image.getScaledInstance(140,161,Image.SCALE_FAST);
        ImageIcon smallIcon = new ImageIcon(smallImage);

        ImageIcon iconMonster = new ImageIcon("resources/pictures/monster.jpg");
        //缩放图片
        Image imageMonster = iconMonster.getImage();
        Image smallImageMonster = imageMonster.getScaledInstance(140,161,Image.SCALE_FAST);
        ImageIcon smallIconMonster = new ImageIcon(smallImageMonster);


        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(26, 27, 160, 181);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(smallIcon);
        lblNewLabel_2.setBounds(10, 10, 140, 161);
        panel_1.add(lblNewLabel_2);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(258, 27, 160, 181);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JLabel label_1 = new JLabel("New label");
        label_1.setIcon(smallIconMonster);
        label_1.setBounds(10, 10, 140, 161);
        panel_2.add(label_1);

        JLabel lblNewLabel = new JLabel("\u6C14\u8840\uFF1A");
        lblNewLabel.setBounds(36, 218, 54, 15);
        panel.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("null");
        lblNewLabel_1.setBounds(96, 218, 54, 15);
        panel.add(lblNewLabel_1);

        JLabel label = new JLabel("\u9B54\u6CD5\uFF1A");
        label.setBounds(36, 247, 54, 15);
        panel.add(label);

        lblNull = new JLabel("null");
        lblNull.setBounds(96, 247, 54, 15);
        panel.add(lblNull);

        JLabel label_2 = new JLabel("\u6C14\u8840\uFF1A");
        label_2.setBounds(268, 218, 54, 15);
        panel.add(label_2);

        lblNull_1 = new JLabel("null");
        lblNull_1.setBounds(328, 218, 54, 15);
        panel.add(lblNull_1);

        JLabel label_4 = new JLabel("\u9B54\u6CD5\uFF1A");
        label_4.setBounds(268, 247, 54, 15);
        panel.add(label_4);

        lblNull_2 = new JLabel("null");
        lblNull_2.setBounds(328, 247, 54, 15);
        panel.add(lblNull_2);

        chckbxNewCheckBox = new JCheckBox("null");
        chckbxNewCheckBox.setBounds(47, 272, 103, 23);
        panel.add(chckbxNewCheckBox);

        chckbxNewCheckBox_1 = new JCheckBox("null");
        chckbxNewCheckBox_1.setBounds(47, 293, 103, 23);
        panel.add(chckbxNewCheckBox_1);

        checkBox = new JCheckBox("null");
        checkBox.setBounds(47, 318, 103, 23);
        panel.add(checkBox);

        checkBox_1 = new JCheckBox("null");
        checkBox_1.setBounds(47, 343, 103, 23);
        panel.add(checkBox_1);

        btnNewButton = new JButton("\u653B\u51FB");
        btnNewButton.setBounds(156, 343, 93, 23);
        panel.add(btnNewButton);


        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ISkill skill=null;
                if(chckbxNewCheckBox.isSelected()){
                    skill = character.getSkill1();
                }
                else if(chckbxNewCheckBox_1.isSelected()){
                    skill = character.getSkill2();
                }
                else if(checkBox.isSelected()){
                    skill = character.getSkill3();
                }
                else if(checkBox_1.isSelected()){
                    skill = character.getSkill4();
                }

                if(state.getValue() == GameCode.CHARACTER_DIE){
                    //角色死亡，退出
                    JOptionPane.showMessageDialog(null,"角色死亡！");
                    character.recover(characterStateManage.getMemento());
                    dispose();
                }
                if(state.getValue() == GameCode.FIGHT_FINISH){
                    //角色胜利，获得奖励
                    JOptionPane.showMessageDialog(null,"角色胜利！");
                    character.recover(characterStateManage.getMemento());

                    System.out.println("-----收获------");
                    System.out.println(resultValues);
                    java.util.List<Object> items = (List<Object>) resultValues.get(GameCode.DROP_ITEM);
                    for(Object obj:items){
                        if(obj instanceof IEquip){
                            character.getEquipBag().add((IEquip) obj);
                        }
                    }
                    character.increaseExperience((Integer) resultValues.get(GameCode.DROP_EXP));
                    character.increaseMoney((Integer) resultValues.get(GameCode.DROP_MONEY));
                    int levelBefore = character.getLevel();
                    character.checkLevelUp();
                    if(character.getLevel() > levelBefore){
                        System.out.println("-------------升级---------------");
                    }
                    dispose();
                }
                //角色行动
                resultValues = fightContext.fightWithMonster(character, monster, skill);
                updateStates();
                contentPane.updateUI();
                //这里，怪物自动行动
                resultValues = fightContext.fightWithMonster(character, monster, skill);
                updateStates();
                contentPane.updateUI();
                stepNum ++;
            }
        });
        updateStates();
        contentPane.updateUI();
    }

    public JLabel getLblNewLabel_1() {
        return lblNewLabel_1;
    }

    public void setLblNewLabel_1(JLabel lblNewLabel_1) {
        this.lblNewLabel_1 = lblNewLabel_1;
    }

    public JLabel getLblNull() {
        return lblNull;
    }

    public void setLblNull(JLabel lblNull) {
        this.lblNull = lblNull;
    }

    public JLabel getLblNull_1() {
        return lblNull_1;
    }

    public void setLblNull_1(JLabel lblNull_1) {
        this.lblNull_1 = lblNull_1;
    }

    public JLabel getLblNull_2() {
        return lblNull_2;
    }

    public void setLblNull_2(JLabel lblNull_2) {
        this.lblNull_2 = lblNull_2;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public JCheckBox getChckbxNewCheckBox() {
        return chckbxNewCheckBox;
    }

    public void setChckbxNewCheckBox(JCheckBox chckbxNewCheckBox) {
        this.chckbxNewCheckBox = chckbxNewCheckBox;
    }

    public JCheckBox getChckbxNewCheckBox_1() {
        return chckbxNewCheckBox_1;
    }

    public void setChckbxNewCheckBox_1(JCheckBox chckbxNewCheckBox_1) {
        this.chckbxNewCheckBox_1 = chckbxNewCheckBox_1;
    }

    public JCheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public JCheckBox getCheckBox_1() {
        return checkBox_1;
    }

    public void setCheckBox_1(JCheckBox checkBox_1) {
        this.checkBox_1 = checkBox_1;
    }

    public JButton getBtnNewButton() {
        return btnNewButton;
    }

    public void setBtnNewButton(JButton btnNewButton) {
        this.btnNewButton = btnNewButton;
    }

    public void updateStates(){
        getLblNewLabel_1().setText(String.valueOf(character.getHp()));
        getLblNull().setText(String.valueOf(character.getMp()));
        getLblNull_1().setText(String.valueOf(monster.getHp()));
        getLblNull_2().setText(String.valueOf(monster.getMp()));
        if(character.getSkill1()!=null){
            getChckbxNewCheckBox().setText(character.getSkill1().description());
        }
        if(character.getSkill2()!=null){
            getChckbxNewCheckBox_1().setText(character.getSkill2().description());
        }
        if(character.getSkill3()!=null){
            getCheckBox().setText(character.getSkill3().description());
        }
        if(character.getSkill4()!=null){
            getCheckBox_1().setText(character.getSkill4().description());
        }
    }
}

package view;

import role.Assassin;
import role.Character;
import role.Magician;
import role.Warrior;
import user.User;
import utils.CharacterSaveHelper;
import utils.GameCode;
import utils.LoginFileHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Zhou Xiaosong
 */
public class LoginFrame extends JFrame {

    public LoginFrame(){
        ImageIcon icon = new ImageIcon("resources/pictures/logo.jpg");
        //缩放图片
        Image image = icon.getImage();
        Image smallImage = image.getScaledInstance(250,200,Image.SCALE_FAST);
        ImageIcon smallIcon = new ImageIcon(smallImage);


        JLabel jLabel = new JLabel(smallIcon);
        jLabel.setPreferredSize(new Dimension(300,200));
        add(jLabel);
        JLabel jl1 = new JLabel("账号：");
        jl1.setPreferredSize(new Dimension(50,30));
        JTextField jt1 = new JTextField();
        jt1.setPreferredSize(new Dimension(200,30));
        JLabel jl2 = new JLabel("密码：");
        jl2.setPreferredSize(new Dimension(50,30));
        JPasswordField jt2 = new JPasswordField();
        jt2.setPreferredSize(new Dimension(200,30));
        add(jl1);
        add(jt1);
        add(jl2);
        add(jt2);
        JCheckBox jcb = new JCheckBox("记住密码");
        add(jcb);
        JButton jb = new JButton("登录");
        add(jb);
        JButton jb2 = new JButton("注册");
        add(jb2);

//        LoginOkButtonListener buttonListener = new LoginOkButtonListener(jt1,jt2);
//        jb.addActionListener(buttonListener);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok按钮被点击！");
                validate(jt1,jt2);
            }
            public void validate(JTextField jt1, JTextField jt2){
                String userName = jt1.getText();
                String userPassword = jt2.getText();
                String result = LoginFileHandler.UserValidate(userName,userPassword,GameCode.LOGIN_FILE);
                if(result != ""){
                    //登录成功之后，需要把角色属性加载进来
                    User user = User.getInstance();
                    user.setUserName(jt1.getText());
                    user.setCharacter(new CharacterSaveHelper(GameCode.CHARACTER_FILE+"/"+result).getObjFromFile());
                    System.out.println(user.getCharacter());
                    JOptionPane.showMessageDialog(null,"登录成功！");
                    //关闭当前窗体
                    dispose();
                    //打开主界面窗体
                    PreBattleFrame preBattleFrame = new PreBattleFrame();
                    Character updateCharacter = user.getCharacter();
                    if(updateCharacter instanceof Warrior){
                        preBattleFrame.getLblNewLabel_19().setText("战士");
                    } else if(updateCharacter instanceof Magician){
                        preBattleFrame.getLblNewLabel_19().setText("法师");
                    } else if (updateCharacter instanceof Assassin){
                        preBattleFrame.getLblNewLabel_19().setText("刺客");
                    }
                    preBattleFrame.getLblNewLabel_1().setText(updateCharacter.getNickName());
                    preBattleFrame.getLblNewLabel_2().setText(String.valueOf(updateCharacter.getLevel()));
                    preBattleFrame.getLblNewLabel_3().setText(String.valueOf(updateCharacter.getHp()));
                    preBattleFrame.getLblNewLabel_4().setText(String.valueOf(updateCharacter.getMp()));
                    preBattleFrame.getLblNewLabel_5().setText(String.valueOf(updateCharacter.getPhysicalAtk()));
                    preBattleFrame.getLblNewLabel_6().setText(String.valueOf(updateCharacter.getMagicalAtk()));
                    preBattleFrame.getLblNewLabel_7().setText(String.valueOf(updateCharacter.getPhysicalDef()));
                    preBattleFrame.getLblNewLabel_8().setText(String.valueOf(updateCharacter.getMagicalDef()));
                    preBattleFrame.getLblNewLabel_9().setText(String.valueOf(updateCharacter.getBloodSucking()));
                    preBattleFrame.getLblNewLabel_10().setText(String.valueOf(updateCharacter.getCritRate()));

                    if(updateCharacter.getHelmet()!=null){
                        preBattleFrame.getLabel_14().setText(updateCharacter.getHelmet().description().split("\\+")[0]);
                    } else{
                        preBattleFrame.getLabel_14().setText("无");
                    }
                    if(updateCharacter.getWeapon()!=null){
                        preBattleFrame.getLblNewLabel_11().setText(updateCharacter.getWeapon().description().split("\\+")[0]);
                    } else{
                        preBattleFrame.getLblNewLabel_11().setText("无");
                    }
                    if(updateCharacter.getClothes()!=null){
                        preBattleFrame.getLblNewLabel_12().setText(updateCharacter.getClothes().description().split("\\+")[0]);
                    } else{
                        preBattleFrame.getLblNewLabel_12().setText("无");
                    }
                    if(updateCharacter.getShoes()!=null){
                        preBattleFrame.getLblNewLabel_13().setText(updateCharacter.getShoes().description().split("\\+")[0]);
                    } else{
                        preBattleFrame.getLblNewLabel_13().setText("无");
                    }
                    if(updateCharacter.getRing()!=null){
                        preBattleFrame.getLblNewLabel_14().setText(updateCharacter.getRing().description().split("\\+")[0]);
                    } else{
                        preBattleFrame.getLblNewLabel_14().setText("无");
                    }
                    preBattleFrame.getLblNewLabel_15().setText(String.valueOf(updateCharacter.getExperience()));
                    preBattleFrame.getLblNewLabel_16().setText(String.valueOf(updateCharacter.getMoney()));

                    preBattleFrame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null,"账户名或密码错误！");
                }
                jt1.setText("");
                jt2.setText("");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterFrame registerFrame = new RegisterFrame();
                registerFrame.setVisible(true);
            }
        });
    }

    public void showUI(){
        setSize(300,350);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setTitle("登录");


        //流式布局
        FlowLayout flow = new FlowLayout();
        setLayout(flow);


        setResizable(false);
        setVisible(true);
    }
}

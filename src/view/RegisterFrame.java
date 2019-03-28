package view;

import utils.LoginFileHandler;
import utils.StatusCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Zhou Xiaosong
 */
public class RegisterFrame extends JFrame {
    private Container c;
    private JLabel a1;
    private JTextField username;
    private JLabel a2;
    private JPasswordField password;
    private JButton okbtn;
    private JButton cancelbtn;
    private JLabel a3;
    private JLabel a4;
    private JComboBox jComboBox;
    private JTextField nickName;
    private String[] characterList = {"战士","法师","刺客"};

    private String fileUrl = "./files/user";

    public RegisterFrame() {
        this.c = this.getContentPane();
        this.a1 = new JLabel("用户名");;
        this.username = new JTextField();
        this.a2 = new JLabel("密   码");
        this.password = new JPasswordField();
        this.okbtn = new JButton("确定");
        this.cancelbtn = new JButton("取消");
        this.a3 = new JLabel("角   色");
        this.jComboBox = new JComboBox(this.characterList);
        this.a4 = new JLabel("昵   称");
        this.nickName = new JTextField();

        setSize(300,260);
        setLocationRelativeTo(null);
        setTitle("注册");

        //设置一层相当于桌布的东西
        c.setLayout(new BorderLayout());//布局管理器
        //设置按下右上角X号后关闭
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //初始化--往窗体里放其他控件
        init();
    }
    public void init(){
        /*标题部分--North*/
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("FightForFree注册系统"));
        c.add(titlePanel, "North");

        /*输入部分--Center*/
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        a1.setBounds(50, 20, 50, 20);
        a2.setBounds(50, 60, 50, 20);
        a3.setBounds(50,100,50,20);
        a4.setBounds(50,140,50,20);
        fieldPanel.add(a1);
        fieldPanel.add(a2);
        fieldPanel.add(a3);
        fieldPanel.add(a4);
        username.setBounds(110, 20, 120, 20);
        password.setBounds(110, 60, 120, 20);
        jComboBox.setBounds(110,100,120,20);
        nickName.setBounds(110,140,120,20);
        fieldPanel.add(username);
        fieldPanel.add(password);
        fieldPanel.add(jComboBox);
        fieldPanel.add(nickName);
        c.add(fieldPanel, "Center");

        /*按钮部分--South*/
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(okbtn);
        buttonPanel.add(cancelbtn);
        c.add(buttonPanel, "South");


        okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = username.getText();
                String userPassword = new String(password.getPassword());
                String userNickName = nickName.getText();
                System.out.println(userName+" "+userPassword);
                if(userName.equals("") || userPassword.equals("")){
                    JOptionPane.showMessageDialog(null, "用户名或密码不能为空");
                }
                else if (userPassword.length() < 6){
                    JOptionPane.showMessageDialog(null, "密码不能低于6位");
                }
                else if (userNickName.equals("")){
                    JOptionPane.showMessageDialog(null, "昵称不能为空！！");
                }
                else if (userNickName.length()>8){
                    JOptionPane.showMessageDialog(null, "昵称不能超过8个字！！");
                }
                else {
                    if(LoginFileHandler.UserRegister(userName,userPassword,userNickName,fileUrl)== StatusCode.REGISTER_SUCCESS){
                        JOptionPane.showMessageDialog(null, "注册成功");
                        //关闭注册窗体
                        dispose();
                    } else if(LoginFileHandler.UserRegister(userName,userPassword,userNickName,fileUrl)== StatusCode.USER_EXISTED){
                        JOptionPane.showMessageDialog(null,"用户名已存在！");
                    } else if(LoginFileHandler.UserRegister(userName,userPassword,userNickName,fileUrl)== StatusCode.NICKNAME_EXISTED){
                        JOptionPane.showMessageDialog(null,"该昵称已存在！");
                    }
                }
            }
        });

        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setResizable(false);
    }
}

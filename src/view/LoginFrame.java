package view;

import listener.LoginOkButtonListener;

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

        LoginOkButtonListener buttonListener = new LoginOkButtonListener(jt1,jt2);
        jb.addActionListener(buttonListener);

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

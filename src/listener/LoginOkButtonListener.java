package listener;

import utils.LoginFileHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * @Author: Zhou Xiaosong
 */
public class LoginOkButtonListener implements ActionListener {

    private JTextField jt1;
    private JTextField jt2;

    private String fileUrl = "./files/user";

    public LoginOkButtonListener(JTextField jt1, JTextField jt2) {
        this.jt1 = jt1;
        this.jt2 = jt2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ok按钮被点击！");
        validate(jt1,jt2);
    }

    public void validate(JTextField jt1, JTextField jt2){
        String userName = jt1.getText();
        String userPassword = jt2.getText();
        if(LoginFileHandler.UserValidate(userName,userPassword,fileUrl)){
            JOptionPane.showMessageDialog(null,"登录成功！");
        } else {
            JOptionPane.showMessageDialog(null,"账户名或密码错误！");
        }
        jt1.setText("");
        jt2.setText("");
    }
}

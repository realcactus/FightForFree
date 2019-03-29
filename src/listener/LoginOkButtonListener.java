package listener;

import role.Character;
import user.User;
import utils.CharacterSaveHelper;
import utils.GameCode;
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
        String result = LoginFileHandler.UserValidate(userName,userPassword,fileUrl);
        if(result != ""){
            JOptionPane.showMessageDialog(null,"登录成功！");
            //登录成功之后，需要把角色属性加载进来
            User user = User.getInstance();
            user.setUserName(jt1.getText());
            user.setCharacter(new CharacterSaveHelper(GameCode.CHARACTER_FILE+"/"+result).getObjFromFile());
            System.out.println(user.getCharacter());
        } else {
            JOptionPane.showMessageDialog(null,"账户名或密码错误！");
        }
        jt1.setText("");
        jt2.setText("");
    }
}

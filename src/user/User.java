package user;

/**
 * @Author: Zhou Xiaosong
 */

import role.Character;

/**
 * 这里保存用户信息，因为用户并不是只有用户名、密码、角色昵称等等，后期可以扩展的
 * 这里用到单例模式，整个软件中获取用户信息
 */
public class User {
    private static volatile User user;
    private User(){

    }
    //单例
    public static User getInstance(){
        if(user == null){
            synchronized (User.class){
                if(user==null){
                    user = new User();
                }
            }
        }
        return user;
    }
    private String userName;
    private String nickName;
    //保存着用户所拥有的角色
    private Character character;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}

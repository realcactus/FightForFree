package utils;

/**
 * @Author: Zhou Xiaosong
 */

import role.Character;
import role.Warrior;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理角色对象的存储和加载的类
 * 目前暂时存储在文件系统里
 */
public class CharacterSaveHelper {
    private String fileName;


    public CharacterSaveHelper(String fileName) {
        this.fileName = fileName;
    }

    /*
     * 将对象保存到文件中
     * params:
     * 类对象
     */
    public void saveObjToFile(Character c){
        try {
            //写对象流的对象

            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(c);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
     * 从文件中读出对象，并且对象
     */
    public Character getObjFromFile(){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName));
            Character c=(Character) ois.readObject();
            return c;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}

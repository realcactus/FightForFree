package utils;

import Equipment.BeginnerHelmet;
import role.*;
import role.Character;
import skill.SimpleCut;

import java.io.*;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 用户账户密码存储文件是这样的
 * 一行用户名“un”+用户名
 * 一行密码“pw”+密码
 * 一行用户昵称“nk”+昵称
 */
public class LoginFileHandler {

    /*
	 * 函数名：FileExistTest
	 * 功能描述：检查本地存储用户名和密码的文件是否已存在，若不存在，则创建新文件
	 * 输入：String fileUrl--需要检查的文件路径（存储本地用户名和密码的文件）
	 * 输出：若文件已存在或（不存在但新建文件成功），则返回true；否则返回false
	 * */
    public static boolean FileExistTest(String fileUrl){
        boolean out = false;
        try{
            File f = new File(fileUrl);
            if(!f.exists()){
                f.createNewFile();

                String sets = " attrib + H  "+f.getAbsolutePath();  //设置文件属性为隐藏
                Runtime.getRuntime().exec(sets);
                out = true;
            }
            out = true;
        } catch (IOException e){
            e.printStackTrace();
        }
        return out;
    }

    /*
     * 函数名：StringSearchLine
     * 功能描述：逐行读取路径为fileUrl的文件，查找字符串strDst是否存在
     * 输入：String strDst--需要查询的目标字符串
     * 		 String fileUrl--需要访问的文件路径
     * 输出：若在文件中查询到目标字符串strDst，则返回true；否则返回flase
     * */
    public static boolean StringSearchLine(String strDst,String fileUrl){
        boolean out = false;
        try {
            FileInputStream fis = new FileInputStream(fileUrl);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line = "";
            while((line = br.readLine()) != null) {
                if(line.equals(strDst)) {
                    out = true;
                    break;
                }
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }



    /*
     * 函数名：StringWriteLine
     * 功能描述：向路径为fileUrl的文件中写入（追加方式）字符串strDIn
     * 输入：String strIn--需要向文件中写入（追加方式）的字符串
     * 		 String fileUrl--需要访问的文件路径
     * 输出：若向文件写入字符串strIn成功，则返回true；否则返回flase
     * */
    public static boolean StringWriteLine(String strIn,String fileUrl) {
        boolean out = false;
        try {
            FileWriter fw = new FileWriter(fileUrl,true);
            fw.write("\n"+strIn);
            fw.close();
            out = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }




    /*
     * 函数名：UserValidate
     * 功能描述：校验登录操作的用户名userName和密码password是否匹配
     * 输入：String userName--登录操作输入的用户名
     * 		 String password--登录操作输入的密码
     * 		 String nickName--登录操作输入的昵称
     * 		 String fileUrl--需要访问的文件路径（存储本地用户名和密码的文件）
     * 输出：若输入的userName和password相匹配，则返回该用户创建的角色的昵称，否则返回空字符串
     * */
    public static String UserValidate(String userName,String password,String fileUrl) {
        String returnValue = "";
        try {
            FileInputStream fis = new FileInputStream(fileUrl);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while((line=br.readLine()) != null) {
                if(line.equals("un" + userName)) {
                    if(br.readLine().equals(String.valueOf(("pw"+password).hashCode()))) {
                        String nickName = br.readLine();
                        returnValue += nickName.substring(2);
                    }
                    //只要检索到用户名，不论密码是否匹配，都终止循环
                    break;
                }
            }
            br.close();
            isr.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }


    /*
     * 函数名：UserRegister
     * 功能描述：以注册操作输入的用户名userName和密码password注册新用户
     * （向存储本地用户名和密码的文件中写入新的用户名的和密码）
     * 输入：String userName--注册操作输入的用户名
     * 		 String password--注册操作输入的密码
     * 		 String nickName--登录操作输入的昵称
     * 		 int character--注册的时候选择的职业
     * 		 String fileUrl--需要访问的文件路径（存储本地用户名和密码的文件）
     * 		 String characterUrl--需要访问的角色文件路径（存储角色对象）
     * 输出：若新用户注册成功，则返回0；用户名存在，则返回-1，昵称存在，则返回-2
     * */
    public static int UserRegister(String userName,String password,String nickName,int character,String fileUrl,String characterFileUrl) {

        if(StringSearchLine("un" + userName, fileUrl)) {
            //用户名已存在
            return GameCode.USER_EXISTED;
        }
        else if (StringSearchLine("nk" + nickName, fileUrl)){
            //昵称已存在
            return GameCode.NICKNAME_EXISTED;
        }
        else {
            //若不存在，依次写入用户名和密码和昵称（分别加上前缀"un"和"pw"和"nk"）
            StringWriteLine("un" + userName, fileUrl);
            StringWriteLine(String.valueOf(("pw" + password).hashCode()), fileUrl);
            StringWriteLine("nk" + nickName, fileUrl);

            //除此之外，还需要创建一个角色，将角色存储到角色文件
            if(character == GameCode.CAREER_WARRIOR){
                //战士
                Character gameCharacter = new WarriorFactory().createCharacter();
                gameCharacter.setNickName(nickName);
                //设置技能装备，用于测试存储
//                gameCharacter.setSkill1(new SimpleCut());
//                gameCharacter.setHelmet(new BeginnerHelmet());
                new CharacterSaveHelper(characterFileUrl).saveObjToFile(gameCharacter);
            } else if(character == GameCode.CAREER_MAGICIAN){
                //法师
                Character gameCharacter = new MagicianFactory().createCharacter();
                gameCharacter.setNickName(nickName);
                //设置技能装备，用于测试存储
//                gameCharacter.setSkill1(new SimpleCut());
//                gameCharacter.setHelmet(new BeginnerHelmet());
                new CharacterSaveHelper(characterFileUrl).saveObjToFile(gameCharacter);
            } else if(character == GameCode.CAREER_ASSASSIN){
                //刺客
                Character gameCharacter = new AssassinFactory().createCharacter();
                gameCharacter.setNickName(nickName);
                //设置技能装备，用于测试存储
//                gameCharacter.setSkill1(new SimpleCut());
//                gameCharacter.setHelmet(new BeginnerHelmet());
                new CharacterSaveHelper(characterFileUrl).saveObjToFile(gameCharacter);
            }
            return GameCode.REGISTER_SUCCESS;
        }
    }

}

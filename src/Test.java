import role.Character;
import utils.*;

public class Test{
    public static void main(String[] args){
        //测试读对象

        Character character = new CharacterSaveHelper(GameCode.CHARACTER_FILE+"/天天").getObjFromFile();
        System.out.println(character.toString());
//        TestObj testObj = new TestObj();
//        CharacterSaveHelper characterSaveHelper = new CharacterSaveHelper(GameCode.CHARACTER_FILE+"/test.txt");
//        testObj.setValue(1000000000);
//        characterSaveHelper.saveTestObj(testObj);
////
//        TestObj result = characterSaveHelper.getTestObjFromFile();
//        System.out.println(result);

//        String s = "大剑";
//        String[] res = s.split("\\+");
//        System.out.println(res);

    }
}

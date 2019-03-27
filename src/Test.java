import java.util.HashMap;
import java.util.Map;

public class Test{
    public static void main(String[] args){
        Map<String, Object> result = new HashMap<>();
        result.put("hp",1);
        result.put("critRate",0.03);
        System.out.println(result);
    }
}

package role;

/**
 * @Author: Zhou Xiaosong
 */

import java.util.Map;

/**
 * 可攻击的对象
 */
public interface Atkable {
    //定义一个物理攻击接口
    Map<String, Object> physicalCut();
}

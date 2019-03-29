package utils;

import java.io.Serializable;

/**
 * @Author: Zhou Xiaosong
 */
public class TestObj implements Serializable {
    private static final long serialVersionUID = -2364345534694190841L;
    private String name ="zxs";
    private int value = 100;

    @Override
    public String toString() {
        return "utils.TestObj{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

package role;

/**
 * @Author: Zhou Xiaosong
 */

/**
 * 角色备忘录状态的管理类
 */
public class CharacterStateManage {

    private CharacterStateMemento memento;

    public CharacterStateMemento getMemento() {
        return memento;
    }

    public void setMemento(CharacterStateMemento memento) {
        this.memento = memento;
    }
}

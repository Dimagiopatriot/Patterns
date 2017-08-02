package abstract_factory.ru_devices;

import abstract_factory.Mouse;

/**
 * Created by troll on 02.08.2017.
 */
public class RuMouse implements Mouse {
    public void click() {
        System.out.println("Щелчек мышью");
    }

    public void dbclick() {
        System.out.println("Двойной щелчек мышью");
    }

    public void scroll(int direction) {
        if (direction>0)
            System.out.println("Скроллим вверх");
        else if (direction<0)
            System.out.println("Скроллим вниз");
        else
            System.out.println("Не скроллим");
    }
}

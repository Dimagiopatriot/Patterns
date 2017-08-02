package abstract_factory.ru_devices;

import abstract_factory.Keyboard;

/**
 * Created by troll on 02.08.2017.
 */
public class RuKeyboard implements Keyboard {
    public void print() {
        System.out.print("Печатаем строку");
    }

    public void println() {
        System.out.println("печатаем строку с переводом строки");
    }
}

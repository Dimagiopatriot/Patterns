package abstract_factory.en_devices;

import abstract_factory.Keyboard;

/**
 * Created by troll on 02.08.2017.
 */
public class EnKeyboard implements Keyboard {
    public void print() {
        System.out.print("Print");
    }

    public void println() {
        System.out.println("Print Line");
    }
}

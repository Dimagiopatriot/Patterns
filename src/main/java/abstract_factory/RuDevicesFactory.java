package abstract_factory;

import abstract_factory.ru_devices.RuKeyboard;
import abstract_factory.ru_devices.RuMouse;
import abstract_factory.ru_devices.RuTouchpad;

/**
 * Created by troll on 02.08.2017.
 */
public class RuDevicesFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new RuMouse();
    }

    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}

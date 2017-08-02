package abstract_factory;

import abstract_factory.en_devices.EnKeyboard;
import abstract_factory.en_devices.EnMouse;
import abstract_factory.en_devices.EnTouchpad;

/**
 * Created by troll on 02.08.2017.
 */
public class EnDevicesFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new EnMouse();
    }

    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}

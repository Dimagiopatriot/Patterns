package abstract_factory;

/**
 * Created by troll on 02.08.2017.
 */
public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

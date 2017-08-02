package abstract_factory.en_devices;

import abstract_factory.Touchpad;

/**
 * Created by troll on 02.08.2017.
 */
public class EnTouchpad implements Touchpad{
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved " + s +  " pixels");
    }
}

package abstract_factory.en_devices;

import abstract_factory.Mouse;

/**
 * Created by troll on 02.08.2017.
 */
public class EnMouse implements Mouse {
    public void click() {
        System.out.println("Mouse click");
    }

    public void dbclick() {
        System.out.println("Double mouse click");
    }

    public void scroll(int direction) {
        if (direction>0)
            System.out.println("Scroll up");
        else if (direction<0)
            System.out.println("Scroll down");
        else
            System.out.println("No scrolling");
    }
}

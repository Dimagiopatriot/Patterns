package abstract_factory;

/**
 * Created by troll on 02.08.2017.
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {

        //Абстрактная фабрика - некий абстрактный метод на стероидах. ТОесть, каждая фабрика место одного типа объекта
        // создает объекты разных типов, но со сходными хар-ками (семейство объектов). Так, RuDevicesFactory создает набор
        //устройств, локализованных на русском, а EnDevicesFactory тот же набор устройств, но локализованных на английском.

        DeviceFactory deviceFactory = getDeviceFactoryByCountryCode("RU");

        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        keyboard.println();
        touchpad.track(10, 35);
    }

    public static DeviceFactory getDeviceFactoryByCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDevicesFactory();
            case "EN":
                return new EnDevicesFactory();
            default:
                throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}

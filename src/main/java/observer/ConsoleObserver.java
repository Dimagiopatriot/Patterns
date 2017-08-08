package observer;

/**
 * Created by troll on 09.08.2017.
 */
public class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Погода изменилась. Температура = " + temperature + ". Давление = " + pressure);
    }
}

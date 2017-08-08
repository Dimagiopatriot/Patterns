package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 09.08.2017.
 */
public class MeteoStation implements Observed {

    int temperature;
    int pressure;
    List<Observer> observers = new ArrayList<>();

    public void setManagments(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.handleEvent(temperature, pressure);
        }
    }
}

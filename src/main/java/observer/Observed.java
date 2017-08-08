package observer;

/**
 * Created by troll on 09.08.2017.
 */
public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

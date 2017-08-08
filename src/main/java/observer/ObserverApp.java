package observer;

/**
 * Created by troll on 09.08.2017.
 */
public class ObserverApp {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setManagments(25, 760);
        meteoStation.setManagments(-5, 745);
    }
}

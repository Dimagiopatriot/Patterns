package factory_method;

/**
 * Created by troll on 02.08.2017.
 */
public class RomeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}

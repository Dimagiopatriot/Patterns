package builder;

/**
 * Created by troll on 03.08.2017.
 */
public class FordMondeoBuilder extends CarBuilder {
    @Override
    void buildMark() {
        car.setMark("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}

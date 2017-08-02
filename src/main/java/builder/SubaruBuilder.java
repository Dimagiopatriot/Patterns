package builder;

/**
 * Created by troll on 03.08.2017.
 */
public class SubaruBuilder extends CarBuilder {
    @Override
    void buildMark() {
        car.setMark("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}

package builder;

/**
 * Created by troll on 03.08.2017.
 */
public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildMark();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }
}

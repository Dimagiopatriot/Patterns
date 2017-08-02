package builder;

/**
 * Created by troll on 03.08.2017.
 */
public abstract class CarBuilder {

    Car car;
    void createCar(){car = new Car();}

    abstract void buildMark();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){return car;}

    //Простой пример билдера ниже
   /* String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder buildMark(String m){
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t){
        this.t = t;
        return this;
    }

    CarBuilder buildMaxSpeed(int s){
        this.s = s;
        return this;
    }

    Car buildCar(){

        Car car = new Car();
        car.setMark(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);

        return car;
    }*/
}

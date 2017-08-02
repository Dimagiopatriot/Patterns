package builder;

/**
 * Created by troll on 03.08.2017.
 */
public class BuilderApp {

    public static void main(String[] args) {
        //Простой пример билдера
       /* Car car = new CarBuilder()
                .buildMark("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(250)
                .buildCar();*/
        Director director = new Director();
        director.setBuilder(/*new SubaruBuilder()*/new FordMondeoBuilder()); // можно просто поменять переаваемый объект
        // для постройки нового авто
        Car car = director.buildCar();
        System.out.println(car);
    }
}

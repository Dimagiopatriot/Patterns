package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class VisitorApp {
    public static void main(String[] args) {
       /* Element body = new BodyElement();
        Element engine = new EngineElement();
        //Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();

        body.accept(mechanic);
        engine.accept(mechanic);*/

       Element car = new CarElement();
       car.accept(new HooliganVisitor());
       System.out.println();
       car.accept(new MechanicVisitor());
    }
}

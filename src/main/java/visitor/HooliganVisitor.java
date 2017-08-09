package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Broke engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Punch doors");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoke in the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Punch "+ wheel.getName() + " wheel");
    }
}

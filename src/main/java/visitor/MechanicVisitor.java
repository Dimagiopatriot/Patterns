package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Fix engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Fix car door");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Check facade of car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Change " + wheel.getName() + " wheel");
    }
}

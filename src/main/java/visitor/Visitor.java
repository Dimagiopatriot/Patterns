package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public interface Visitor {
    //visit метод для каждого элемента
    void visit(EngineElement engine);
    void visit(BodyElement body);
    void visit(CarElement car);
    void visit(WheelElement wheel);
}

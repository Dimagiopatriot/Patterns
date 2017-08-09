package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class CarElement implements Element {
    Element[] elements;

    public CarElement(){
        this.elements = new Element[]{ new WheelElement("left front"), new WheelElement("right front"),
                new WheelElement("left back"), new WheelElement("right back"),
                new BodyElement(), new EngineElement()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element: elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}

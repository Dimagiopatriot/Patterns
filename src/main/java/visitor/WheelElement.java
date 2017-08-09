package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class WheelElement implements Element {
    String name;
    public WheelElement(String name){this.name = name;}

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

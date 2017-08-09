package visitor;

/**
 * Created by troll on 09.08.2017.
 */
public class BodyElement implements  Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

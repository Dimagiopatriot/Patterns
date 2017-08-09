package visitor;

/**
 * Created by troll on 09.08.2017.
 */
interface Element {
    void accept(Visitor visitor);
}

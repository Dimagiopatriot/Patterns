package delegate;

/**
 * Created by troll on 08.08.2017.
 */
public class DelegateApp {
    public static void main(String[] args) {
       /* A a = new A();
        a.f();*/

       Painter painter = new Painter();
       painter.setGraphics(new Square());
       painter.draw();

       painter.setGraphics(new Triangle());
       painter.draw();
    }
}

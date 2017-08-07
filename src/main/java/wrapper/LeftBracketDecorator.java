package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        ///Как бы оболочка над Printerom которая добавляет скобку слева вначале. Заметим, что сам калсс Printer не
        // изменился
        System.out.print("[");
        super.print();
    }
}

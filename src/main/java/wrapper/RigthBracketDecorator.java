package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
public class RigthBracketDecorator extends Decorator{

    public RigthBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        ///Как бы оболочка над Printerom которая добавляет скобку справа вконце. Заметим, что сам калсс Printer не
        // изменился
        super.print();
        System.out.print("]");
    }
}

package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        ///Как бы оболочка над Printerom которая добавляет кавычки вначале и в конце. Заметим, что сам калсс Printer не
        // изменился
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

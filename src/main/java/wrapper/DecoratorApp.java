package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
public class DecoratorApp {

    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new RigthBracketDecorator(new LeftBracketDecorator(new Printer("Privet"))));

        printer.print();
    }
}

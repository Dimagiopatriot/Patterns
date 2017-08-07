package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
abstract class Decorator implements PrinterInterface{
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print(){
        component.print();
    }
}

package wrapper;

/**
 * Created by troll on 07.08.2017.
 */
public class Printer implements PrinterInterface {
    String value;

    Printer(String value){
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(value);
    }
}

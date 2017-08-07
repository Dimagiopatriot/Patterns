package iterator;

/**
 * Created by troll on 08.08.2017.
 */
public class IteratorApp {

    public static void main(String[] args) {
        Tasks c = new Tasks();

        Iterator it = c.getIterator();
        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }
}

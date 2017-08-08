package observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by troll on 09.08.2017.
 */
public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась. Температура = " + temperature + ". Давление = " + pressure);
            pw.println();
            pw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package adapter;

/**
 * Created by troll on 06.08.2017.
 */
public class AdapterApp {

    public static void main(String[] args) {
        //1-й способ через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
        //2-й способ через композицию
        VectorGraphicsInterface g12 = new VectorAdapterFromRaster2(new RasterGraphics());
        g1.drawLine();
        g1.drawSquare();
    }
}

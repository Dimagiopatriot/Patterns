package adapter;

/**
 * Created by troll on 06.08.2017.
 */
public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

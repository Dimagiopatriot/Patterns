package Adapter;

/**
 * Created by troll on 06.08.2017.
 */
public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

    RasterGraphics rasterGraphics;

    VectorAdapterFromRaster2(RasterGraphics rasterGraphics){
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}

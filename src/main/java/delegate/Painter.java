package delegate;

/**
 * Created by troll on 08.08.2017.
 */
public class Painter {
    Graphics graphics;

    void setGraphics(Graphics graphics){
        this.graphics = graphics;
    }

    // Вот еще пример делегации рисования с художника на саму графику
    void draw(){
        graphics.draw();
    }
}

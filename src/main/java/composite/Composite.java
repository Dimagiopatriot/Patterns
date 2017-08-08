package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troll on 09.08.2017.
 */
public class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape shape){
        components.add(shape);
    }

    public void removeComponent(Shape shape){
        components.remove(shape);
    }

    @Override
    public void draw() {
        //Должно быть обязательно для всех элементов композит!
        for (Shape shape: components){
            shape.draw();
        }
    }
}

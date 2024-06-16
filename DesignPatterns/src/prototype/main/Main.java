package prototype.main;

import prototype.shape.Circle;
import prototype.shape.Rectangle;
import prototype.shape.Shapes;

import java.util.ArrayList;
import java.util.List;

import static prototype.shape.CloneAddCompare.cloneAndCompare;

public class Main {
    public static void main (String[] args) {
        List<Shapes> shapes = new ArrayList<>();
        List<Shapes> shapesCopy = new ArrayList<>();

        Circle circle = new Circle(10, 20, 30);
        shapes.add(circle);

        Rectangle rectangle = new Rectangle(10, 20);
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }


}

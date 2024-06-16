package prototype.shape;

import java.util.List;

public class CloneAddCompare {

    public static void cloneAndCompare (List<Shapes> shapes, List<Shapes> shapesCopy) {
        for (Shapes shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                shapes.get(i).draw();
                shapesCopy.get(i).draw();
            } else {
                System.out.println(i + ": Shapes are the same object (booo!)");
            }
        }
    }
}

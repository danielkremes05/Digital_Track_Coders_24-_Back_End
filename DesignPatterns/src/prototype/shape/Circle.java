package prototype.shape;

public class Circle implements Shapes {

    private int x;
    private int y;
    private int radius;

    public Circle (int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (Circle target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.radius = target.radius;
        }
    }

    @Override
    public Shapes clone () {
        return new Circle(this);
    }

    @Override
    public void draw () {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

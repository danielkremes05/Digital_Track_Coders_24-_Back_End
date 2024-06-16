package prototype.shape;

public class Rectangle implements Shapes {

    private int width;
    private int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (Rectangle target) {
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shapes clone () {
        return new Rectangle(this);
    }

    @Override
    public void draw () {
        System.out.println("Drawing Rectangle with width " + width + " and height " + height);
    }
}

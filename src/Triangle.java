public class Triangle extends Figure {
    protected final int x, y, z, h, a;

    public Triangle(int x, int y, int z, int h, int a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }

    @Override
    public double getArea() {
        return a/2 * h;
    }
}
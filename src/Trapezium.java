public class Trapezium extends Figure {

    protected final int a, b, h;

    public Trapezium(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return (a + b) / 2 * h;
    }
}

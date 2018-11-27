public class Parallelogram extends Figure {

    protected final int a, h;

    public Parallelogram(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}

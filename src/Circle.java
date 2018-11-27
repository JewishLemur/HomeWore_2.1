
public class Circle extends Figure {
    protected final int r , pi;

    public Circle(int r, int pi) {
        this.r = r;
        this.pi = pi;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return r * r * pi;
    }
}



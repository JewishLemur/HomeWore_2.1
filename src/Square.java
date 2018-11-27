public final class Square extends Figure {
    private final int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public double getPerimeter() {
        return 4 * x;
    }

    @Override
    public double getArea() {
        return x * x;
    }
}
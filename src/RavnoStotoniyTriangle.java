public class RavnoStotoniyTriangle extends Triangle {

    public RavnoStotoniyTriangle(int x, int a, int h) {
        super(x, x, x, a, h);
    }

    public int getX() {
        return x;
    }

    @Override
    public double getArea() {
        return a / 2 * h;
    }
}

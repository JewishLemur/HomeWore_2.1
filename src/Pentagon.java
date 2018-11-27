public class Pentagon extends Figure {
    protected final int a, b, c;

    public Pentagon(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return a + b + c;  //С формулой площади пятиугольника все слишком плохо)))
    }
}

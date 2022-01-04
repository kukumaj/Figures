
class Triangle extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return Math.abs(0.5 *
                (( ( b.getX()-a.getX() ) *( c.getY()-a.getY() )
                  - ( c.getX()-a.getX() ) *( b.getY()-a.getY() ))));
    }

    @Override
    public String pointsToString() {
        return Figure.pointsToString(a, b, c);
    }

    @Override
    public Point leftmostPoint() {
        return Figure.findLeftmostPoint(a, b, c);
    }

    @Override
    public String toString() {
        return figureToString("Triangle", a, b, c);
    }
}

class Quadrilateral extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double area() {
        return Math.abs(0.5 *
                (( ( c.getX()-a.getX() ) *( d.getY()-a.getY() )
                        - ( d.getX()-a.getX() ) *( c.getY()-a.getY() ))))+
                Math.abs(0.5 *
                        (( ( c.getX()-a.getX() ) *( b.getY()-a.getY() )
                                - ( b.getX()-a.getX() ) *( c.getY()-a.getY() ))));
    }



    @Override
    public String pointsToString() {
        return Figure.pointsToString(a, b, c, d);
    }

    @Override
    public Point leftmostPoint() {
        return Figure.findLeftmostPoint(a, b, c, d);
    }

    @Override
    public String toString() {
        return Figure.figureToString("Quadrilateral", a, b, c, d);
    }
}
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
    public double areaq() {
        return Math.abs(0.5 *
                (( ( b.getX()-a.getX() ) *( c.getY()-a.getY() )
                        - ( c.getX()-a.getX() ) *( b.getY()-a.getY() ))))+
                Math.abs(0.5 *
                        (( ( b.getX()-a.getX() ) *( d.getY()-a.getY() )
                                - ( d.getX()-a.getX() ) *( b.getY()-a.getY() ))));
    }

    @Override
    public double areaq() {
        return 0; // todo
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
class Circle extends Figure {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String pointsToString() {
        return Figure.pointsToString(center);
    }

    @Override
    public Point leftmostPoint() {
        Point p = new Point(center.getX()-radius, center.getY() );
        return p;
    }

    @Override
    public String toString() {
        return Figure.figureToString("Circle", center, radius);
    }
}
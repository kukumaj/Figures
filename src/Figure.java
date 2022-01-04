abstract class Figure {
    public abstract double area();

    public abstract String pointsToString();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public abstract Point leftmostPoint();

    public static String pointsToString(Point... points) {
        StringBuilder result = new StringBuilder();
        for (Point point : points) {
            result.append(point.toString());
        }

        return result.toString();
    }

    public static String figureToString(String figureName, Object... elements) {
        StringBuilder result = new StringBuilder(figureName);
        result.append("[");
        for (Object element : elements) {
            result.append(element.toString());
        }
        result.append("]");

        return result.toString();
    }

    public static Point findLeftmostPoint(Point... points) {
        Point candidate = points[0];

        for (Point point : points) {
            if (point.getX() < candidate.getX()) {
                candidate = point;
            }
        }

        return candidate;
    }
}
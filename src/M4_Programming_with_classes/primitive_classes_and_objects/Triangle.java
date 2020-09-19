package M4_Programming_with_classes.primitive_classes_and_objects;

public class Triangle {
    /*
     * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
     * площади, периметра и точки пересечения медиан.
     */

    private Point a;
    private Point b;
    private Point c;

    Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
        this.c = new Point(cx, cy);
    }

    private double getSideAB() {
        return this.a.distanceTo(this.b);
    }

    private double getSideBC() {
        return this.b.distanceTo(this.c);
    }

    private double getSideAC() {
        return this.a.distanceTo(this.c);
    }

    private double getPerimeter() {
        return getSideAB() + getSideAC() + getSideBC();
    }

    private double getArea() {
        double halfPerimeter = getPerimeter() / 2.0;
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - getSideAB()) * (halfPerimeter - getSideBC()) * (halfPerimeter - getSideAC()));
    }

    private Point getBarycenter() {
        double x0 = (this.a.getX() + this.b.getX() + this.c.getX()) / 3;
        double y0 = (this.a.getY() + this.b.getY() + this.c.getY()) / 3;
        return new Point(x0, y0);
    }
}

class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distanceTo(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,0);
        Point p2 = new Point(0,0);
        Point p3 = new Point(0,4);
        Point p4 = new Point(3,4);
        Triangle tr = new Triangle(p1,p2,p3);
        double area =tr.area();
        System.out.println(area);
        Point center = new Point(0,0);
        double radius =1;
        Circle cr = new Circle(center,radius);
        System.out.println("Area of Circle = "+cr.area());
        Point pa = new Point(3,0);
        Point pb = new Point(0,0);
        Point pc = new Point(0,4);
        Point pd = new Point(3,4);
        Quadrilateral qr = new Quadrilateral(pa,pb,pc,pd);
        double are =qr.area();
        System.out.println(are);
    }
}

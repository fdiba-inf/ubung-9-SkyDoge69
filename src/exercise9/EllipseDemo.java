package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 2);
        Ellipse e1 = new Ellipse();
        Ellipse e2 = new Ellipse(p1, 5, 6 );
        Ellipse e3 = new Ellipse(p1, 5, 6);
        Ellipse e4 = new Ellipse();
        e4.initialize();

        System.out.println("Ellipse 1: " + e1);
        System.out.println("Ellipse 2: " + e2);
        System.out.println("Ellipse 3: " + e3);
        System.out.println("Ellipse 4: " + e4);

        System.out.println("Ellipse 2 equals Ellipse 1: " + e2.equal(e1));
        System.out.println("Ellipse 2 equals Ellipse 3: " + e2.equal(e3));
    }
}

package exercise9;

public class Ellipse {
    private Point startPoint;
    private double height;
    private double width;

    public Ellipse() {
        startPoint = new Point(0, 0);
        height = 1;
        width = 1;
    }

    public Ellipse(Point startPoint, double height, double width) {
        this.startPoint = new Point(startPoint);
        this.height = height;
        this.width = width;
    }

    public Ellipse(Ellipse otherEllipse) {
        startPoint = new Point(otherEllipse.startPoint);
        height = otherEllipse.height;
        width = otherEllipse.width;
    }

    public boolean isValid() {
        return height > 0 && width > 0;
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter height: ");
            height = Utils.INPUT.nextDouble();
            System.out.print("Enter width: ");
            width = Utils.INPUT.nextDouble();
        } while (!isValid());
    }

    public double calculatePerimeter() {
        double p =  Math.PI * ( 3 * (height + width) - Math.sqrt((3*height + width)*(height + 3*width)));
        if (p < 0) {
            return p * -1;
        }
        return p;
    }

    public double calculateArea() {
        return height * width * Math.PI;
    }

    public String getType() {
        return (height == width) ? "Circle" : "Ellipse";
    }

    public String toString() {
        return String.format("(%s, %s)-[%s, %s], %s, P=%s, A=%s", startPoint.getX(), startPoint.getY(), height, width, getType(), calculatePerimeter(), calculateArea());
    }

    public boolean equal(Ellipse otherEllipse) {
        boolean sameHeight = Utils.equals(height, otherEllipse.height);
        boolean sameWidth = Utils.equals(width, otherEllipse.width);
        boolean sameHeightReversed = Utils.equals(height, otherEllipse.width);
        boolean sameWidthReversed = Utils.equals(width, otherEllipse.height);

        return (sameHeight && sameWidth) || (sameHeightReversed && sameWidthReversed);
    }
}

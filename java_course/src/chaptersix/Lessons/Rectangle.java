package chaptersix.Lessons;

public class Rectangle {

    // protected double length; // everything in the package can access
    private double length; // only this class can access
    private double width;
    double area = calculateArea();
    double perimeter = calculatePerimeter();

    // default constructor
    // 1- same name as Class
    // 2- no inputs
    // 3- some access level outside the Class (like public)

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; // set injecting directly in the parameter
        setWidth(width); // set using a method
    }

    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    // some methods to set parameters;
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    double calculateArea() {
        return length * width;
    }
}

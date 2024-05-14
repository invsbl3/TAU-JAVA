package chapter11.shapes;

public class ShapeTester {
    public static void main(String[] args) {
        // Shape rectangle = new Shape(); // cant instantiate an abstract
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

package chaptersix.Lessons;

public class RoomCalculator {
    public static void main(String[] args) {

        // Instantiating an Object of the Class Rectangle
        // 1- using the direct constructor
        Rectangle room1 = new Rectangle(25, 50);
        // 2- with the default constructor + setters
        Rectangle room2 = new Rectangle();
        room1.setWidth(30);
        room1.setLength(75);

        // doing some process with the data
        double totalArea = room1.calculateArea() + room2.calculateArea();
        System.out.println("Area of both rooms: " + totalArea);

    }
}

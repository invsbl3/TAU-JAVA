package chapter9.someclasses;

public class Square extends Rectangle {


    // this method is OVERRIDING a method in the Rectangle Class
    // it has same signature (access modifiers, output type, name, inputs);
    // but it's implementation changes...
    // It's important to warn readers that this is happening!!!!
    // writting @override guarantees that you are overriding a method, too..
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }


    // Overload
    public void printClass(String what){
        System.out.println("I`m a " + what);
    }

}

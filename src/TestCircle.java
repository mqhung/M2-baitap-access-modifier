import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(10);
        System.out.println("Radius is: " + secondCircle.getRadius());
        System.out.println("Area is: " + secondCircle.getArea());
    }
}

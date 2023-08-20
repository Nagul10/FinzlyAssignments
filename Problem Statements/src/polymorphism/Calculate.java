package polymorphism;

public class Calculate {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Triangle triangle = new Triangle(10,20);
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Circle circle = new Circle(20);
        circle.calculateArea();
        circle.calculatePerimeter();

    }

}

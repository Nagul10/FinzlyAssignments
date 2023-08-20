package polymorphism;

public class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length*breadth;
        System.out.println("Area of Rectangle = "+ area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = length+breadth;
        System.out.println("Perimeter Of Rectangle = "+ perimeter);
    }
}

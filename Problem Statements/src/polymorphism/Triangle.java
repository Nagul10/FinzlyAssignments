package polymorphism;

public class Triangle implements Shape{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = 0.5*base*height;
        System.out.println("Area of Triangle = " + area);
    }

    @Override
    public void calculatePerimeter() {

        double perimeter = 3*base;
        System.out.println("Perimeter of Triangle = "+ perimeter);
    }
}

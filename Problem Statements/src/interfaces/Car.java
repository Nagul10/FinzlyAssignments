package interfaces;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car applied brake");
    }
}

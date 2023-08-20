package interfaces;

public class MotorCycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle applied brakes");
    }
}

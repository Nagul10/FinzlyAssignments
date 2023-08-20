package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.start();
        motorCycle.accelerate();;
        motorCycle.brake();
    }
}

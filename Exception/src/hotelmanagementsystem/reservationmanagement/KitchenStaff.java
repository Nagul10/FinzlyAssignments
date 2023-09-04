package hotelmanagementsystem.reservationmanagement;

public class KitchenStaff  extends Employee{
    public KitchenStaff(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public void doWork() {
        cook();
    }

    void cook(){
        System.out.println("Cooking !!!!");
    }
}

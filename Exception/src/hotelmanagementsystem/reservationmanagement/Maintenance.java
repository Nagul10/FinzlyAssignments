package hotelmanagementsystem.reservationmanagement;

public class Maintenance extends Employee{
    public Maintenance(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public void doWork() {
        maintenance();
    }

    void maintenance(){
        System.out.println("Maintenance happening");
    }
}

package hotelmanagementsystem.reservationmanagement;

public class FrontDesk extends Employee{

    public FrontDesk(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public void doWork() {
        checkInGuests();
    }

    void checkInGuests(){
        System.out.println("checking guests");
    }
}

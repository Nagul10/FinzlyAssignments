package hotelmanagementsystem.reservationmanagement;

public class HouseKeeping extends Employee{
    public HouseKeeping(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public void doWork() {
        cleanRoom();
    }

    void cleanRoom(){
        System.out.println("Cleaning Room");
    }
}

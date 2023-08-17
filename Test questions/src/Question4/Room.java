package Question4;

public class Room {
    private int roomNo;
    private int capacity;
    private double pricePerNight;
    private boolean isReserved;
    private String checkInDate;
    private String checkOutDate;

    public Room(int roomNo, int capacity, double pricePerNight) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
        this.checkInDate = null;
        this. checkOutDate = null;
    }

    public boolean isAvailable(String checkInDate, String checkOutDate){
        if(!isReserved){
            return true;
        }
        return false;
    }
    public void reserve(String checkInDate,String checkOutDate){
        if(!isReserved && isAvailable(checkInDate,checkOutDate)){
            isReserved = true;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            System.out.println("Reservation Successful");
        }
        else {
            System.out.println("Reservation Failed");
            System.out.println("Room is not available");
        }
    }
    public void reserve(){
        if(!isReserved){
            isReserved = true;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            System.out.println("Reservation Successful");
        }
        else {
            System.out.println("Reservation Failed");
            System.out.println("Room is not available");
        }
    }
    @Override
    public String toString() {
        return "Room #" + roomNo +
                ", Capacity: " + capacity +
                ", Price per Night: Rs." + pricePerNight +
                ", Reserved: " + (isReserved ? "Yes" : "No") +
                (isReserved ? ", Check-in: " + checkInDate + ", Check-out: " + checkOutDate : "");
    }
}

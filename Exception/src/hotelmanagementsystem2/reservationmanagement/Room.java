package hotelmanagementsystem2.reservationmanagement;

public class Room {
    private int roomNo;
    private double price;
    private boolean availability;

    public int getRoomNo() {
        return roomNo;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public Room(int roomNo, double price) {
        this.roomNo = roomNo;
        this.price = price;
        this.availability=true;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}

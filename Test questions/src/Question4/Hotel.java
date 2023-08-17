package Question4;

public class Hotel {
    public static void main(String[] args) {
        Room room1 = new Room(101, 2, 150.0);
        Room room2 = new Room(102, 4, 200.0);

        System.out.println(room1);
        System.out.println("Available: " + room1.isAvailable("2023-08-20", "2023-08-25"));

        // Make reservations
        room1.reserve();
        System.out.println(room1);
        System.out.println("Available: " + room1.isAvailable("2023-08-20", "2023-08-25"));

        room2.reserve("2023-08-20", "2023-08-25");
        System.out.println(room2);
        System.out.println("Available: " + room2.isAvailable("2023-08-20", "2023-08-25"));
    }
}

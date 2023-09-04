package hotelmanagementsystem2.userinterface;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import hotelmanagementsystem2.reservationmanagement.*;
import hotelmanagementsystem2.exceptions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RoomManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Room> rooms = new HashMap<>();
    static List<Guest> guests = new ArrayList<>();
    public RoomManagement(){
        rooms.put(1,new DeluxeRoom(1,2000));
        rooms.put(2,new StandardRoom(2,2000));
        rooms.put(3,new Suite(3,2000));
        rooms.put(4,new DeluxeRoom(4,2000));
        rooms.put(5,new StandardRoom(5,2000));
        rooms.put(6,new Suite(6,2000));
    }
    public static void main(String[] args) {
        RoomManagement roomManagement = new RoomManagement();


        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Welcome to Room Management System");
            System.out.println("------------------------------------");
            System.out.println("1. List available rooms");
            System.out.println("2. Reserve a room");
            System.out.println("3. Exit");
            System.out.println("------------------------------------");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try {
                        roomManagement.listAvailableRooms();
                    } catch (RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        roomManagement.reserveRoom();
                    } catch (InvalidReservationException | RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Thank you ");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void reserveRoom() throws InvalidReservationException,RoomNotFoundException {
        System.out.println("Enter Guest Name");
        String name = sc.nextLine();
        System.out.println("Enter Guuest Id");
        int guestId = sc.nextInt();
        guests.add( new Guest(guestId,name));
        listAvailableRooms();
        System.out.println("Enter Room ID to reserve");
        int id = sc.nextInt();
        if (rooms.containsKey(id)) {
            if(rooms.get(id).isAvailability()) {
                rooms.get(1).setAvailability(false);
                System.out.println("Room Reserved");
            }
            else
                throw new InvalidReservationException(" Room Is Already Occupied");
        } else {
            throw new RoomNotFoundException("No Such Room Found");
        }
    }

    private void listAvailableRooms() throws RoomNotFoundException{
        for (int i:rooms.keySet()){
            System.out.println(rooms.get(i).toString());
        }
    }

}

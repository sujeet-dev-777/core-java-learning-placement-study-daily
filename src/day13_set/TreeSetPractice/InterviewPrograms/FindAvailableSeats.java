package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindAvailableSeats {

    public static void main(String[] args) {

        TreeSet<Integer> availableSeats = new TreeSet<>();

        availableSeats.add(1);
        availableSeats.add(3);
        availableSeats.add(5);
        availableSeats.add(7);
        availableSeats.add(10);
        availableSeats.add(12);
        availableSeats.add(15);
        availableSeats.add(20);

        int requestedSeat = 8;

        System.out.println("Available Seats: " + availableSeats);

        System.out.println("Requested Seat: " + requestedSeat);

        System.out.println("Nearest Seat Below: " + availableSeats.floor(requestedSeat));

        System.out.println("Nearest Seat At/Above: " + availableSeats.ceiling(requestedSeat));

        System.out.println("Next Strictly Higher Seat: " + availableSeats.higher(requestedSeat));
    }
}
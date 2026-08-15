package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TicketQueueDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> ticketNumbers = new TreeSet<>();

        ticketNumbers.add(101);
        ticketNumbers.add(105);
        ticketNumbers.add(110);
        ticketNumbers.add(115);
        ticketNumbers.add(120);

        int requestedTicket = 108;

        System.out.println("Available Tickets: " + ticketNumbers);

        System.out.println("Requested Ticket: " + requestedTicket);

        System.out.println("Nearest Lower Ticket: " + ticketNumbers.floor(requestedTicket));

        System.out.println("Nearest Higher Ticket: " + ticketNumbers.ceiling(requestedTicket));

        Integer bookedTicket = ticketNumbers.pollFirst();

        System.out.println("Booked First Available Ticket: " + bookedTicket);

        System.out.println("Remaining Tickets: " + ticketNumbers);
    }
}
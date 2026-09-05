package Day17_Multithreading;


class TicketCounter {

    private int availableTickets = 1;

    synchronized void bookTicket(String user) {

        if (availableTickets > 0) {

            System.out.println(user + " is booking a ticket...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableTickets--;

            System.out.println(user + " successfully booked the ticket.");

        } else {

            System.out.println(user + " failed. No tickets available.");
        }
    }
}

public class TicketBookingDemo {

    public static void main(String[] args) throws InterruptedException {

        TicketCounter counter = new TicketCounter();

        Thread user1 = new Thread(() -> {
            counter.bookTicket("User 1");
        });

        Thread user2 = new Thread(() -> {
            counter.bookTicket("User 2");
        });

        user1.start();
        user2.start();

        user1.join();
        user2.join();
    }
}
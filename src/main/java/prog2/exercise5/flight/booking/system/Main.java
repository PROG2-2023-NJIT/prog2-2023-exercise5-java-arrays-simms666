package prog2.exercise5.flight.booking.system;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        System.out.println("Please enter how many tickets you want to book:");
        Scanner scanner = new Scanner(System.in);

        int number  =scanner.nextInt();
        scanner.nextLine();

        FlightBooking flightBooking = new FlightBooking(number);
        flightBooking.reserveTickets(number);
        flightBooking.displayTripDetails();
    }
}

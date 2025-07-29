import java.util.*;

// Abstract class
abstract class Movie {
    String movieId;
    String title;
    double ticketPrice;
    int numberOfTickets;

    public Movie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    abstract double calculatePrice();

    public void displayDetails() {
        System.out.println("\nMovie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);

        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets");
        } else {
            double total = calculatePrice();
            System.out.println("Total Price: " + total);
        }
    }
}

// TeluguMovie class
class TeluguMovie extends Movie {
    public TeluguMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    double calculatePrice() {
        double baseTotal = ticketPrice * numberOfTickets;
        double gst = 0.05 * baseTotal;
        return baseTotal + gst;
    }
}

// HindiMovie class
class HindiMovie extends Movie {
    public HindiMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    double calculatePrice() {
        double baseTotal = ticketPrice * numberOfTickets;
        double discount = 0.10 * baseTotal;
        double discountedTotal = baseTotal - discount;
        double gst = 0.05 * discountedTotal;
        return discountedTotal + gst;
    }
}

// EnglishMovie class
class EnglishMovie extends Movie {
    public EnglishMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    double calculatePrice() {
        double baseTotal = ticketPrice * numberOfTickets;
        double threeDCharge = 50 * numberOfTickets;
        double total = baseTotal + threeDCharge;
        double gst = 0.05 * total;
        return total + gst;
    }
}

// Main Class
public class MovieBookingSystem {
    static Scanner sc = new Scanner(System.in);
    static List<Movie> movieList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Movie Booking System Menu =====");
            System.out.println("1. Add Movie Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Update Ticket Count");
            System.out.println("4. Delete Booking by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addMovie(); break;
                case 2: viewMovies(); break;
                case 3: updateBooking(); break;
                case 4: deleteBooking(); break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    public static void addMovie() {
        System.out.println("\nChoose Movie Type:");
        System.out.println("1. Telugu Movie");
        System.out.println("2. Hindi Movie");
        System.out.println("3. English Movie");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Movie ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        Movie movie = null;
        switch (type) {
            case 1: movie = new TeluguMovie(id, title, price, tickets); break;
            case 2: movie = new HindiMovie(id, title, price, tickets); break;
            case 3: movie = new EnglishMovie(id, title, price, tickets); break;
            default: System.out.println("Invalid movie type!"); return;
        }

        movieList.add(movie);
        System.out.println("Booking added successfully!");
    }

    public static void viewMovies() {
        if (movieList.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Movie movie : movieList) {
                movie.displayDetails();
            }
        }
    }

    public static void updateBooking() {
        System.out.print("Enter Movie ID to update tickets: ");
        String id = sc.nextLine();
        boolean found = false;

        for (Movie movie : movieList) {
            if (movie.movieId.equalsIgnoreCase(id)) {
                System.out.print("Enter new number of tickets (max 6): ");
                int newTickets = sc.nextInt();
                if (newTickets <= 6) {
                    movie.numberOfTickets = newTickets;
                    System.out.println("Tickets updated!");
                } else {
                    System.out.println("Cannot book more than 6 tickets.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Movie ID not found.");
        }
    }

    public static void deleteBooking() {
        System.out.print("Enter Movie ID to delete booking: ");
        String id = sc.nextLine();
        Iterator<Movie> iterator = movieList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.movieId.equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Booking deleted!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Booking ID not found.");
        }
    }
}

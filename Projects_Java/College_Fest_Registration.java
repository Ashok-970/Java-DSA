import java.util.Scanner;

class Participant {
    private int participantId;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventCharge;

    public void setParticipantDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Participant ID: ");
        participantId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Participant Name: ");
        name = sc.nextLine();
        System.out.print("Enter Base Registration Fee: ");
        baseRegistrationFee = sc.nextDouble();
        System.out.print("Enter Number of Events: ");
        numberOfEvents = sc.nextInt();
        System.out.print("Enter Event Charge per Event: ");
        eventCharge = sc.nextDouble();
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getName() {
        return name;
    }

    public double getBaseRegistrationFee() {
        return baseRegistrationFee;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public double getEventCharge() {
        return eventCharge;
    }

    public double getTotalFee() {
        return baseRegistrationFee + (numberOfEvents * eventCharge);
    }

    public void displayDetails() {
        System.out.println("Participant ID: " + participantId);
        System.out.println("Participant Name: " + name);
        System.out.println("Base Registration Fee: " + baseRegistrationFee);
        System.out.println("Number of Events: " + numberOfEvents);
        System.out.println("Event Charge per Event: " + eventCharge);
        System.out.println("Total Fee: " + getTotalFee());
    }
}

public class College_Fest_Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Participant p = new Participant();
        int choice;
        do {
            System.out.println("\n--- College Fest Registration Menu ---");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Participant Details");
            System.out.println("3. Show Total Fee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    p.setParticipantDetails();
                    System.out.println("Participant registered successfully!");
                    break;
                case 2:
                    System.out.println("\n--- Participant Details ---");
                    p.displayDetails();
                    break;
                case 3:
                    System.out.println("Total Fee: " + p.getTotalFee());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
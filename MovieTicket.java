import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter day type (weekday/weekend): ");
        String day = sc.nextLine();
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        double price = 0;

        if (age < 0 || tickets <= 0) {
            System.out.println("Invalid input.");
        } else if (day.equalsIgnoreCase("weekday")) {
            if (age <= 12) {
                price = 8;
            } else if (age <= 59) {
                price = 12;
            } else {
                price = 6;
            }
            System.out.println("Total Cost: $" + (price * tickets));
        } else if (day.equalsIgnoreCase("weekend")) {
            if (age <= 12) {
                price = 10;
            } else if (age <= 59) {
                price = 15;
            } else {
                price = 8;
            }
            System.out.println("Total Cost: $" + (price * tickets));
        } else {
            System.out.println("Invalid input.");
        }
    }
}


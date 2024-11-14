import java.util.Scanner;

public class AirlineTicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter passenger's age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter day of the week (1-7, where 1 is Monday): ");
        int dayOfWeek = scanner.nextInt();
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        // Calculate ticket price
        double basePrice = 200.0;
        double finalPrice = basePrice;
        
        // Apply age-based discounts
        if (age < 12) {
            finalPrice *= 0.5; // 50% discount for children
        } else if (age >= 60) {
            finalPrice *= 0.85; // 15% discount for seniors
        }
        
        // Apply weekend surcharge
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            finalPrice += 20;
        }
        
        // Apply peak season surcharge
        if (month >= 6 && month <= 8) {
            finalPrice += 50;
        }
        
        // Output final price
        System.out.printf("The final ticket price is: $%.2f%n", finalPrice);
        
        scanner.close();
    }
}

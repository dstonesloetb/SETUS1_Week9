import java.util.Scanner;

public class CoffeeShopDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double ITEM_PRICE = 5.00;
        final double LOYALTY_DISCOUNT = 0.10;
        final double BULK_DISCOUNT = 0.15;
        final double SPECIAL_DAY_DISCOUNT = 0.20;

        // Input
        System.out.print("Enter number of items purchased: ");
        int numberOfItems = scanner.nextInt();

        System.out.print("Does the customer have a loyalty card? (yes/no): ");
        boolean hasLoyaltyCard = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Is it a special promotional day? (yes/no): ");
        boolean isSpecialDay = scanner.next().equalsIgnoreCase("yes");

        // Calculate total price before discount
        double totalPrice = numberOfItems * ITEM_PRICE;

        // Determine applicable discount
        double discount = 0.0;

        if (isSpecialDay) {
            discount = SPECIAL_DAY_DISCOUNT;
        } else if (numberOfItems > 5) {
            discount = BULK_DISCOUNT;
        } else if (hasLoyaltyCard) {
            discount = LOYALTY_DISCOUNT;
        }

        // Calculate final price after applying discount
        double finalPrice = totalPrice - (totalPrice * discount);

        // Output
        System.out.printf("Final price after applying discount: $%.2f%n", finalPrice);

        scanner.close();
    }
}

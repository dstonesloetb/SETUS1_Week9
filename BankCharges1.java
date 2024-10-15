
import java.util.Scanner;

/* 
 * Purpose:  Bank Charges 1 
 * Name: D. Stones
 * Date: 15/11/2023      
 *
*/


public class BankCharges1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input for bank account balance
        System.out.print("Enter your bank account balance: ");
        double balance = scanner.nextDouble();

        // Calculate interest or overdraft charge
        double charge = 0;
        if (balance >= 1000) {
            charge = balance * 0.10; // 10% interest
        } else if (balance >= 200 && balance <= 999.99) {
            charge = balance * 0.05; // 5% interest
        } else if (balance >= 0.01 && balance <= 199.99) {
            charge = balance * 0.01; // 1% interest
        } else if (balance < 0) {
            charge = balance * 0.13; // 13% overdraft charge
            //System.out.println(charge);   testing purposes 
        }

        // Calculate updated balance
        double updatedBalance = balance + charge;

        // Output interest or overdraft charge and updated balance
        if (charge > 0) {
            System.out.println("Interest charge: " + charge);
            System.out.println("Updated bank balance: " + updatedBalance);
        } else if (balance == 0) {
            System.out.println("No interest or overdraft charge. Your balance is still 0.");
        } else if (balance <0) {
            System.out.println("Interest charge: " + charge);
            System.out.println("Updated bank balance: " + updatedBalance);
        }
        else {
            System.out.println("Invalid input. Please enter a valid bank balance.");
        }

        // Close the scanner
        scanner.close();
    } //end main
} //end class 

/* 
 * Water Break
 * Purpose:  To display divorce status
 * Name: D. Stones
 * Date: 15/11/2023
 *
*/

public class WaterBreak {
    public static void main(String[] args) {

        // You can change the value of 'noOfMilesCovered' to test different cases
        byte noOfMilesCovered = 10; 

        // Using switch statement to determine if water break is available
        switch (noOfMilesCovered) {
            case 5:
            case 10:
            case 15:
            case 20:
            case 25:
                System.out.println("Water is available at this mark");
                break;
            default:
                System.out.println("No water is available at this mark");
        } //end switch




        // Using if-else statement and logical OR
        // to determine if a water break is available 

        if (noOfMilesCovered == 5 || noOfMilesCovered == 10 || noOfMilesCovered == 15
                || noOfMilesCovered == 20 || noOfMilesCovered == 25) {
            System.out.println("Water is available at this mark");
        } else {
            System.out.println("No water is available at this mark");
        }


    } //end main 
} //end class

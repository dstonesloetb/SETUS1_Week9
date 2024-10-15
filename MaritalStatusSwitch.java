
/* 
 * MaritalStatusProgram
 * Purpose:  To display divorce status
 * Name: D. Stones
 * Date: 15/11/2023
 *
*/

public class MaritalStatusSwitch {

    public static void main(String[] args) {

        // You can change the value of 'status' to test different cases
        char status = 'M'; 

        //Output relevant divorce status 

        switch (status) {
            case 'S':
                System.out.println("Status: Single");
                break;
            case 'D':
                System.out.println("Status: Divorced");
                break;
            case 'M':
                System.out.println("Status: Married");
                break;
            case 'W':
                System.out.println("Status: Widowed");
                break;
            default:
                System.out.println("Invalid data");
        } //end switch 
    } //end main 
} //end class 

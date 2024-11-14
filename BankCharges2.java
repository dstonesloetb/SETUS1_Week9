import java.util.Scanner;

public class BankCharges2 {

      public static void main(String[] args) {
        
        //Declare and initialise variables   
        String accountType = "";
        float curBalance = 0.0f, savingBalance =0.0f;
        float interest = 0.0f, overDraftFee =0.0f;
        float updatedBalance = 0.0f;
      
        // Declare and initialise constants 
       // final String CURRENT_ACCOUNT = "Current";
       // final String SAVING_ACCOUNT =  "Savings";
        
        // Create an instance of the scanner class 
        Scanner in = new Scanner(System.in);
        
        // Program header and user input account type        
        System.out.println("BANK BALANCE PROGRAM");
        System.out.println("----------------------");

        
        System.out.println("Please enter account type");
        System.out.println("Please choose Current for Current Account or");
        System.out.print("Saving for Saving Account:");
        accountType = in.nextLine();
       
        // request user input 
        System.out.print("Please enter account balance: ");
        

        
        // Select based on account type
        
        if (accountType.equalsIgnoreCase("Current"))
        {
           // user inputs current account balance
           curBalance = in.nextFloat();
                
            // Check current account balance
            if (curBalance < 0)     // Overdrawn
            {
                               
                //overDraftFee = curBalance * 0.12
                overDraftFee = curBalance *0.12f;

                //updatedBalance = curBalance + overDraftFee
                updatedBalance = curBalance + overDraftFee;
                
                //OUTPUT curBalance, overDraftFee, updatedBalance
                System.out.println("Old balance is: " + curBalance);
                System.out.println("Overdraft charge is: " + overDraftFee);
                System.out.println("New balance is: " + updatedBalance);
            }
            else        // positive current account balance
            {   
                //interest = curBalance * 0.01
                interest = curBalance *0.01f;

                // updatedBalance = curBalance + interest 
                updatedBalance = curBalance + interest;
             
                //OUTPUT curBalance, interest, updatedBalance
                System.out.println("Old balance is: " + curBalance);
                System.out.println("Interest is: " + interest);
                System.out.println("New balance is: " + updatedBalance);
            }
        }
        // SAVING ACCOUNT CONDITIONS 
        else
        {
            // user inputs balance
            savingBalance = in.nextFloat();
            
            // Check saving's account balance
            
            if (savingBalance<0)        // not possible
            {
                //OUTPUT “Error”
                System.out.println("Error no negative savings!");
            }
            
            else if (savingBalance <=1000)      // saving rate 1
            {
                //interest = savingBalance * 0.015
    		interest = savingBalance *0.015f;
              
                // System.out.println("S1 Test");
              	//updatedBalance = savingBalance + interest 
                updatedBalance = savingBalance + interest;
                
                //OUTPUT savingBalance, interest, updatedBalance
                System.out.println("Old balance is: " + savingBalance);
                System.out.println("Interest is: " + interest);
                System.out.println("New balance is: " + updatedBalance);
            }
            else                                // saving rate 2
            {
                //interest = savingBalance * 0.05
		//updatedBalance = savingBalance + interest 
		interest = savingBalance *0.05f;
                //System.out.println("S2 Test");
                updatedBalance = savingBalance + interest;
                
                //OUTPUT savingBalance, interest, updatedBalance
                System.out.println("Old balance is: " + savingBalance);
                System.out.println("Interest is: " + interest);
                System.out.println("New balance is: " + updatedBalance);
            }
        } // end of outer if else
             
    }   // end of main method
    
}   // end of class

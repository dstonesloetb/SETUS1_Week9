import java.util.Scanner;

/**
 * Name: UserInput.java
 * Purpose: To use the Scanner class to get input
 * Student Name: Insert student name
 * Student Number: 12345678
 */
public class TallestPerson {

    public static void main(String[] args) {
        //Declare a scanner object 
        Scanner inScan = new Scanner(System.in);

        //Declare and initialise input variables
        //Person 1 details
        String namePerson1 = "";
        int p1HeightInFeet = 0;
        int p1HeightInInches =0;
        //stores person 1's total height in
        //inches note: 1 foot = 12 inches
        int p1TotalHeightInches = 0;

        //Person 2 details
        String namePerson2 = "";
        int p2HeightInFeet = 0;
        int p2HeightInInches =0;
        int p2TotalHeightInches = 0;

        //Difference in height between two people
        int diffInHeight=0;

        //Program heading
        System.out.println("Height Comparison Program");
        System.out.println("-------------------------");

        // Input names

        //Prompt person 1 for their name
        System.out.print("Please enter the name for person 1: ");
        namePerson1 = inScan.nextLine();

        //Prompt person 2 for their name
        System.out.print("Please enter the name for person 2: ");
        namePerson2 = inScan.nextLine();


        //Input height info

        //Prompt for person 1's height in feet
        System.out.print("Please enter "+namePerson1 +
                "'s height in feet: ");
        p1HeightInFeet = inScan.nextInt();

        //Prompt for person 1's height in inches
        System.out.print("Please enter "+namePerson1 +
                "'s height in inches: ");
        p1HeightInInches = inScan.nextInt();


        //Prompt for person 2's height in feet
        System.out.print("Please enter "+namePerson2 +
                "'s height in feet: ");
        p2HeightInFeet = inScan.nextInt();

        //Prompt for person 2's height in inches
        System.out.print("Please enter "+namePerson2 +
                "'s height in inches: ");
        p2HeightInInches = inScan.nextInt();


        //Output Person 1's details
        System.out.println(namePerson1+"'s height is "+
                p1HeightInFeet + " foot " +
                p1HeightInInches + "\".");

        System.out.print("\n");

        //Output Person 2's details
        System.out.println(namePerson2+"'s height is "+
                p2HeightInFeet + " foot " +
                p2HeightInInches + "\".");

        System.out.print("\n");

        //Calculate height in inches for both persons
        //1 foot = 12 inches
        p1TotalHeightInches = p1HeightInFeet * 12
                + p1HeightInInches;
        p2TotalHeightInches = p2HeightInFeet * 12
                + p2HeightInInches;



        //Determine who is tallest
        //if-else 
        //Output which person is tallest and by how much        
        if (p1TotalHeightInches > p2TotalHeightInches)
        {
            //p1 is taller than p2
            diffInHeight = p1TotalHeightInches-p2TotalHeightInches;
            System.out.println(namePerson1+" is taller than "
            + namePerson2 + " by "+ diffInHeight + " inches.");
        }
        else if (p2TotalHeightInches > p1TotalHeightInches)
        {
            //p2 is taller than p1
            diffInHeight = p2TotalHeightInches-p1TotalHeightInches;
            System.out.println(namePerson2+" is taller than "
            + namePerson1 + " by "+ diffInHeight + " inches.");
        }
        else 
        {
            //Both people have the same height
            System.out.println("Both "+namePerson1 +" and "+
                    namePerson2 +" are the same height.");
        }


    } //end main

} //end class

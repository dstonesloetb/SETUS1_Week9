public class SwitchExamples {


    public static void main(String[] args) {
        
        //Switch Example 1

       
        
//        if (day==1)
//        {
//            System.out.println("Monday");
//        }
//        else if (day==2)
//        {
//            System.out.println("Tuesday");
//        }
//        else if (day==3)
//        {
//            System.out.println("Wednesday");
//        }
        
        // Set the day 
        int day = 7;
        
        switch(day)
        {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;  
            case 6: case 7:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Incorrect day value");

        } //end switch 
        
        //Output is Thursday as day = 4 
        
        
        //Switch Example 2 
        //Output the number of days in the month
        //depending on what month it is
        
        int month = 2;  //february 
        int year = 2024; //current year
        
        switch (month)
        {
            //months that have 30 days
            //September, April, June and November 
            case 9: case 4: case 6: case 11:
                System.out.println("The month has 30 days!");
                break;
            //months that have 31 days
            //January, March, May, July, August, Oct, December
            case 1: case 3: case 5: case 7: case 8:
            case 10: case 12:
                System.out.println("The month has 31 days.");
                break;
            //months that have 28 or 29 days (February)
            case 2: 
                if (year %4==0)
                {
                    System.out.println("29 Days in the month");
                }
                else
                {
                    System.out.println("28 Days in the month");
                }
                break;
            default:
                System.out.println("Incorrect month");
            
        } //end switch 
        
        
        //Switch example 3 
        //Constant expressions
        //Declare 3 constants to represent colours
        final int RED = 1;
        final int GREEN = 2;
        final int BLUE = 3; 
        
        //Set the current colour
        int colour = 2;  //GREEN 
        
        switch (colour)
        {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default: 
                System.out.println("Invalid colour");
        } //end switch
        
        
        
        
        //Example 4 
        //Switch statement with strings
        String fruit = "apple";
        
        switch(fruit)
        {
            case "apple":
                System.out.println("You selected an apple");
                break;
            case "banana":
                System.out.println("You selected an banana");
                break;    
            case "orange":
                System.out.println("You selected an orange");
                break;
            default:
                System.out.println("Invalid fruit.");
        } //end switch
        
        
        //Example 5:  Nested switch
        //Switch firstly on the category
        // and then where applicable
        //switch on the sub category
        int category = 1;
        int subCategory = 3;
        
        switch (category)
        {
            case 1: 
                switch (subCategory)
                {
                    case 1: 
                        System.out.println("Cat 1, Sub Cat 1");
                        break;
                    case 2:
                        System.out.println("Cat 1, Sub Cat 2");
                        break;
                    default:
                        System.out.println("Unknown sub category!");
                } //end inner switch
                break;
            case 2:
                System.out.println("Category 2");
                break;
            default: 
                System.out.println("Unknown category!");

        } //end switch
        
        
    } //end main 
    
} //end class 

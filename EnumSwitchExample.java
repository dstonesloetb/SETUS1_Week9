enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSwitchExample {

    public static void main(String[] args) {
        
        //Declare an instance of the Day
        //enumerated type
        Day today = Day.THURSDAY;
        
        switch (today)
        {
            case SUNDAY:
                System.out.println("Its a relaxing day!");
                break;
            case MONDAY: case TUESDAY: case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a work day!");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend");
                break;
            case SATURDAY:
                System.out.println("Its the weekend");
                break;
            default:
                System.out.println("Invalid day!");
        } //end switch
        
      
    } //end main
    
} //end class 

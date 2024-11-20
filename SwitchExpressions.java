package com.mycompany.s1_selectionexamples;

public class SwitchExpressions {

    public static void main(String[] args) {
        // String variable to represent the day
        
        String day = "Monday";
        
        int dayNumber = switch(day)
        {
            //case "Monday": case "Wed": case "Friday": 
            case "Monday", "Wednesday", "Friday" -> 1;
            case "Tuesday", "Thursday" -> 2;
            case "Saturday", "Sunday" -> 3;
            default -> 
                throw new IllegalArgumentException("Invalid day: "+day);
            
        }; //end switch 
        
        System.out.println("Day Number for "+day+ " is: "+dayNumber);
        
    } //end main
    
} //end class 

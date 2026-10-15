package com.mycompany.s1selection;

public class Ternary {

    public static void main(String[] args) {
        //Example 1 - Caffine Fuel Gauge
        
        int cupsOfCoffee =4;
        
                            // True or False      TRUE     FALSE
        String energyLevel = (cupsOfCoffee>3) ? "Flying through hyperspace!" 
                                              :  "Dragging like a zombie!" ;
                
        System.out.println(energyLevel);
        
        
        //Example 2 - Video Game Difficulty
        
        boolean isHardcoreMode = true; 
        
                        //  true/false      true    false 
        int enemyHealth = isHardcoreMode ?  500 :    100; 
        
        System.out.println("Enemy HP: "+enemyHealth);
        
        
        //Example 3 - Super Hero Title
        
        String timeOfDay = "night";
        
        String heroTitle = timeOfDay.equals("night") ? "The Dark Knight" 
                                                     : "The Daylight Defender";
        
        
        System.out.println("Hero name: "+heroTitle);
        
        
    }
}

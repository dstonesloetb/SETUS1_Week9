package com.mycompany.s1selection;

public class FunIf {

    public static void main(String[] args) {
        // Example 1 - If Statement Dragon Encounter
        
        boolean hasDragonSword = true; 
        
        System.out.println("You enter a dark cave...");
        
            //true or false 
        if (hasDragonSword){    //shortcut for checking if true
            System.out.println("The dragon sees your "
                    + "glowing sword and flees in terror!");
        }  //end if   

        System.out.println("You continue your journey safely..");
        
        
        //Example If Else - Zombie Apocalypse Check 
        
        int runningSpeedKmh = 12;  //our speed
        int zombieSpeedKmh = 15;   //zombie speed 
        
            //     12       >    15    false 
        if (runningSpeedKmh > zombieSpeedKmh) {
            System.out.println("You outran the zombie! You found a "
                    + "safe house.");            
        }        
        else {
            System.out.println("Oh no! The zombie caught you. Time"
                    + " to join the zombie horde.");
        }
        
        //ctd rest of program  
        
        
        //Example 3 - Superhero Power Meter
        
        int energyLevel = 85; // Out of 100

        if (energyLevel >= 90) {
            System.out.println("Superhuman! You can fly and shoot lasers right now.");
        } else if (energyLevel >= 50) { // Evaluates if the top condition was false
            System.out.println("Powering up. You can leap over small buildings.");
        } else if (energyLevel >= 15) {
            System.out.println("Feeling sluggish. You can barely lift a heavy backpack.");
        } else { // Triggers if none of the above match
            System.out.println("Out of power! Go take a nap, hero.");
        }

        
        //Example 4
        boolean hasSecretPasscode = true;
        String spyName = "Agent 007";

        if (hasSecretPasscode) {
            System.out.println("Outer door unlocked. Verifying identity...");

            // Nested check inside the outer condition
            if (spyName.equals("Agent 007")) {
                System.out.println("Welcome back, James. Your gadget briefcase is ready.");
            } else {
                System.out.println("Intruders detected in the inner sanctum!");
            }

        } else {
            System.out.println("Access Denied! Self-destruct sequence in 3... 2... 1...");
        }

        
        
        
    } //end main 
    
} //end class 

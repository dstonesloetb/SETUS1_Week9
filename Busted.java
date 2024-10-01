/**
 * Purpose: To Demo Ternary Conditional Operator
 * @author DarrenStones
 * Date: 
 * 
 */
public class Busted {

    public static void main(String[] args) {
        //initial speed of car detected by speedvan
        int speed = 120; 
        //Motorway Speed Limit
        final int MOTORWAY_SPEEDLIMIT = 120;

        //Check if car is speeding 
//        boolean busted = 
//                (speed > MOTORWAY_SPEEDLIMIT)? true : false; 

        //Ouput result of speed test 
//        System.out.println("Issue speeding ticket: "+busted);


        //Check if car is speeding 
        String busted = 
                (speed > MOTORWAY_SPEEDLIMIT)? "Issue Ticket" : "No Ticket"; 

        //Ouput result of speed test 
        System.out.println(busted);

    } //end main
} //end class 

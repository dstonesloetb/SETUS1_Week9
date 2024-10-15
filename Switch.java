class Switch {
  public static void main(String[] args) {
    //Declare variables to store current month
    //and year 
    int month = 2, year = 2022;  // Feb 2022 

    //Declare a variable to store the number
    //of days in the month 
    int num = 0;

    //test the value assigned
    //to the month variable
    switch(month)
    {
      //Check is the month 
      //Jan, March,May, July,Aug,Oct,Dec 
      case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
        num = 31;
        break;

      case 4: case 6: case 9: case 11: 
        num = 30; //april,june,sept,nov
        break;
      case 2: //feb - check if leap year?
          //num = (year%4==0) ? 29 : 28;
          if (year%4==0) {
            num = 29; //leap year 
          }
          else {
            num = 28; //not a leap year 
          }
           break;
      default:
          System.out.println("Error");
    } //end switch
    //Display result to console 
    System.out.println(month+"/"+year+": "
                + ""+num+" days");

  } //end main 

} //end class

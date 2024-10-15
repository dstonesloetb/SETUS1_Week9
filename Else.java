class Else {
  public static void main(String[] args) {
     int hrs = 16;
    //test cases: 
     // -1, 0, 12,13,17,18,25, 13.5   
       if (hrs < 13)
       {
          System.out.println("Good morning: "+hrs);
       }
       else if (hrs<18)
       {
          System.out.println("Good afternoon: "+hrs);
       }
       else
       { 
          System.out.println("Good evening: "+hrs);
       }// end if 
  } //end main 
} //end class

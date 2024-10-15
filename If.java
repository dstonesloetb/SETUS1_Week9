class If {
  public static void main(String[] args) {
    // Determine if one number
    // is greater than another number
    // single statement example
    if (1>5) System.out.println("One is less than five");
        
    // Example two
    // Check if one number is less
    // than another number
    // execute multiple statement 
        
    if (4>2)
    {
      System.out.println("Four is greater than two");
      System.out.println("Test succeeded");
    } // end if 
        
    // if statement with 
    // Boolean conditional operators
    //single statement example 
    int num = 8;
        
    if (((num >5 ) && (num<10)) || (num==12))
      System.out.println("Number is 6-9 inclusive, or 12");
        
  } // end main method 
    
} // end class

class CoditionalOperator {
  public static void main(String[] args) {
   
    //Declare and initialise 
    //two integer variables
        
    int num1 = 1357;
    int num2 = 2468;
        
    //store test result
    String result; 
        
    //Determine whether the first integer
    //value is an odd or even number
    result = (num1 % 2 != 0) ? "Odd" : "Even";
    System.out.println(num1 + " is " + result);
        
    //Determine whether the second integer
    //value is an odd or even number
    result = (num2 % 2 != 0) ? "Odd" : "Even";
    System.out.println(num2 + " is " + result);
  }
}

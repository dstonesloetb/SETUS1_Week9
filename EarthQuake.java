public class EarthQuake {

    public static void main(String[] args) {
        //Declare and initialise variables
        float magnitude = 0.0f;
        String category = "";
        
        // Input the earthquake magnitude
        System.out.print("Please enter the earth quake "
                + "magnitude: ");
        magnitude = EasyIn.getFloat();
        
        //Determine the category of the earthquake 
        if (magnitude<2.0f)
        {
            category = "micro";
        }
        else if (magnitude>=2.0 && magnitude <=2.9)
        {
            category = "mini";
        }
        else if (magnitude>=3.0 && magnitude <=3.9)
        {
            category = "minor";
        }
        else if (magnitude>=4.0 && magnitude <=4.9)
        {
            category = "light";
        }
        else if (magnitude>=5.0 && magnitude <=5.9)
        {
            category = "moderate";
        }
        else if (magnitude>=6.0 && magnitude <=6.9)
        {
            category = "strong";
        }
        else if (magnitude>=7.0 && magnitude <=7.9)
        {
            category = "major";
        }
        else if (magnitude >=8.0)
        {
            category = "great";
        }
        else
        {
            category = "";
            System.out.println("Incorrect value");
        }
        
        //Output the result
        System.out.println("Earthquake category: "+category);
        
        
    } //end main 
    
} //end class 

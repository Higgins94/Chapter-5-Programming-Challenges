import java.util.Scanner;  
/**
   This program outputs job expense and requirments for a given job. 
   Prompts the user to enter the number of rooms to be painted, 
   the price of the paint per gallon and the square feet of wall space in each room. 
   
   The following are constants given: 
   -For every 115sqft of wall space, one gallon of paint and eight hours of labor are required. 
   -The company charges $18.00 an hour for labor. 
*/
public class PaintJobEstimator { 
	public static void main(String[] args) {
   
      final int SQUARE_FEET = 115;   
      int roomsToPaint; 
      double squFtInput, squFtTotal = 0, paintRequired, laborHourRequired ,gallonCost, costOfPaint, laborCost, total$Cost; 
      
      Scanner scan = new Scanner(System.in);
       
      ///////////////////////////////////////////////////
      //Prompting for Information and Input Validations//
      ///////////////////////////////////////////////////
      System.out.print("Enter the number of rooms to be painted: ");
      roomsToPaint = scan.nextInt(); 
      while (roomsToPaint % 1 != 0 || roomsToPaint <= 0) {
         System.out.println("Invalid Entry");
         System.out.print("\nEnter the number of rooms to be painted: ");
         roomsToPaint = scan.nextInt(); 
      } 
      for (int i = 1; i <= roomsToPaint; i++) { 
         System.out.printf("\nEnter the Square Footage of Room #%d: " ,i); 
         squFtInput = scan.nextDouble();
         while (squFtInput <= 0) { 
            System.out.println("Invalid Entry");
            System.out.printf("\nEnter the Square Footage of Room #%d: " ,i);
            squFtInput = scan.nextDouble(); 
         } 
         squFtTotal += squFtInput; 
       } 
       
       if (squFtTotal < 115) {
         System.out.printf("\n\nYou must have a minimum of %d square feet " ,SQUARE_FEET);
         System.out.print("\nEnter the number of rooms to be painted: ");
         roomsToPaint = scan.nextInt(); 
         while (roomsToPaint % 1 != 0 || roomsToPaint <= 0) {
            System.out.println("Invalid Entry");
            System.out.print("\nEnter the number of rooms to be painted: ");
            roomsToPaint = scan.nextInt(); 
         } 
   
         for (int i = 1; i <= roomsToPaint; i++) { 
            System.out.printf("\nEnter the Square Footage of Room #%d: " ,i); 
            squFtInput = scan.nextDouble();
            while (squFtInput <= 0) { 
               System.out.println("Invalid Entry");
               System.out.printf("\nEnter the Square Footage of Room #%d: " ,i);
               squFtInput = scan.nextDouble(); 
            } 
         squFtTotal += squFtInput; 
         } 
       }
    
       System.out.print("\nEnter the Cost Per Gallon of the Paint: $"); 
       gallonCost = scan.nextDouble();
       if (gallonCost < 0) { 
         System.out.println("Invlaid Input: Negative for Paint Cost"); 
         System.out.print("\nEnter the Cost Per Gallon of the Paint: $"); 
         gallonCost = scan.nextDouble();
       }
       
            /////////////////////////// 
            //  Methods are called   //
            //Output is beneath calls// 
            /////////////////////////// 
       paintRequired = PaintRequired(squFtTotal); 
       laborHourRequired = LaborRequired(squFtTotal);
       laborCost = LaborCharges(laborHourRequired);
       costOfPaint = CostOfPaint(gallonCost, paintRequired);
       total$Cost = Total$Cost(laborCost,costOfPaint);  
       
       System.out.println("\n\t\t        JOB REQUIREMENTS"); 
       System.out.println("________________________________________________");
       System.out.printf("\nRooms To Paint: %d" ,roomsToPaint); 
       System.out.print(" room(s)\n\n");
       System.out.printf("Total Gallons Of Paint: %,.1f" ,paintRequired);
       System.out.print(" gallon(s) of paint\n\n");
       System.out.printf("Per Gallon Of Paint Cost: $%,.2f\n\n" ,gallonCost);
       System.out.printf("Total Paint Cost: $%,.2f\n\n" ,costOfPaint); 
       System.out.printf("Total Labor Hours: %,.1f" ,laborHourRequired);
       System.out.print(" hours(s)\n\n");
       System.out.printf("Total Labor Cost: $%,.2f\n\n" ,laborCost);
       System.out.printf("Total Job Expense: $%,.2f" ,total$Cost);
        System.out.print("\n________________________________________________\n");
        
       

     
   } 
   
   /**
      The PaintRequired method will calculate the total amount of paint 
      required for the job
      @perma squFtTotal The value for the total sqft of all the rooms
      @return paintRequired The value for them total number of gallons required
   */
   public static double PaintRequired(double squFtTotal) { 
      final int SQUARE_FEET = 115;
      double paintRequired =  squFtTotal / SQUARE_FEET; 
      return paintRequired; 
   } 
   
   /**
      The LaborRequired method will calculate how many hours of labor 
      will be required 
      @perma squFtTotal The value for the total sqft of all the rooms
      @return laborHourRequired The value for total hours required 
   */ 
   
   public static double LaborRequired(double squFtTotal) { 
      final int SQUARE_FEET = 115;
      final int HOUR_LABOR = 8; 
      double laborHourRequired = squFtTotal / SQUARE_FEET * HOUR_LABOR; 
      return laborHourRequired; 
   } 
   
   /**
      The CostOfPaint method calculates the total cost of the paint required
      @perma gallonCost is the price per gallon of paint 
      @result costOfPaint The value for the total cost of paint 
   */ 
   
   public static double CostOfPaint(double gallonCost, double paintRequired) { 
      double costOfPaint = gallonCost * paintRequired; 
      return costOfPaint; 
   }  
   
   /**
      The LaborCharges method will calculate the total cost of labor for the job
      @perma laborHourRequired The value for total hours required
      @return laborCharge The value for the total cost of labor
   */
   
   public static double LaborCharges(double laborHourRequired)  {
      final double HOUR_RATE = 18.00;
      final int HOUR_LABOR = 8;
      double laborCost = laborHourRequired / HOUR_LABOR * HOUR_RATE; 
      return laborCost; 
   }
   
   /**
      The Total$Cost method will add all expenses to give a final cost of the job 
      @perma laborCost The value for the total cost of labor
      @perma costOfPaint The value for the total cost of paint 
      @return total$Cost The value for the total cost of the job
   */
   
   public static double Total$Cost(double laborCost, double costOfPaint) { 
      double total$Cost = laborCost + costOfPaint; 
      return total$Cost; 
   } 
       
      
   
       
      
   
   
   
      
          
        
         

             
         
         
} 
      
      
      
   
               
       
      
      
      
                      
         
      
         
         
     
    
    
    
    
     
    
      
    
     
      
     
    
         
    
    
     
    
   
   
  
   
   
      
      
      
      
       
      
      
    
   
        
     
  
           
    
                                
                                
                                   
   
	
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

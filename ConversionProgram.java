import java.util.Scanner;  
/**
   This program converts meters into either kilometers, inches or feet.    
*/
public class ConversionProgram{ 
	public static void main(String[] args) {
   
      Menu(); 
   }
   
   /**
      The ShowKilometers method is to calculate kilometers given meters. 
      @perma meters Holds the value for the amount of meters.
   */
   public static void ShowKilometers(double meters) { 
      double kilometers = meters * 0.001; 
      System.out.printf("\n%,.2f kilometers" ,kilometers);
   }
   
   /**
      The ShowInches method is to calculate kilometers given meters. 
      @perma meters Holds the value for the amount of meters.
   */ 
   
   public static void ShowInches(double meters) { 
      double inches = meters * 39.37; 
      System.out.printf("\n%,.2f Inches" ,inches); 
   }
   
   /**
      The ShowFeet method is to calculate feet given meters 
      @perma meters Holds the value for the amount of meters.
   */
   
   public static void ShowFeet(double meters) { 
      double feet = meters * 3.281; 
      System.out.printf("\n%,.2f Feet" ,feet); 
   } 
   
   /**
      The Menu method displays a menu to the user and ask for which unit 
      of measurement to convert to or to quit. 
   */ 
   
   public static void Menu() { 
   
      Scanner scan = new Scanner(System.in);  
      
      String again = "Y"; 
      int menuChoice;
      double meters;  
      
      while (again.equalsIgnoreCase("Y")) { 
         System.out.print("\nChoose From One Of The Following:"); 
         System.out.print("\n\n\t1. Convert to Kilometers\n\t2. Convert to Inches\n\t3. Convert to Feet\n\t4. Quit Program");
         System.out.printf("\n\n(Your Selection): ");  
         menuChoice = scan.nextInt(); 
         if (menuChoice == 1) { 
            System.out.print("\nMeters: "); 
            meters = scan.nextDouble(); 
            ShowKilometers(meters);
         } else if (menuChoice == 2) { 
            System.out.print("\nMeters: "); 
            meters = scan.nextDouble(); 
            ShowInches(meters);
         } else if (menuChoice == 3) { 
            System.out.print("\nMeters: "); 
            meters = scan.nextDouble(); 
            ShowFeet(meters); 
         } else if (menuChoice == 4) { 
            System.out.println("OK, Have A Beautiful Day!");
            System.exit(0);
         } else { 
            System.out.print("Invalid Menu Selection\n"); 
            continue; 
         } 
         scan.nextLine(); 
         System.out.print("\n\nBack To Menu?"); 
         System.out.print("\n\"Y\" or \"N\": "); 
         again = scan.nextLine();  
      }
    System.out.println("OK, Have A Beautiful Day!");
   }
}
         
   
    
   
       
   















    
   
  
      
      
   
       
      
   
   
   
      
          
        
         

             
         
         
      
      
      
   
               
       
      
      
      
                      
         
      
         
         
     
    
    
    
    
     
    
      
    
     
      
     
    
         
    
    
     
    
   
   
  
   
   
      
      
      
      
       
      
      
    
   
        
     
  
           
    
                                
                                
                                   
   
	
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

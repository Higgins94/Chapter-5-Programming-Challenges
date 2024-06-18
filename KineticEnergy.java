import java.util.Scanner; 
/**
   This program accepts inputs for an object's mass (in kilograms) and 
   velocity (in meters per seconds) o calculate kinetic energy. 
*/

public class KineticEnergy { 
   public static void main (String [] args) { 
      
      Scanner scan = new Scanner(System.in); 
      
      double mass, seconds; 
      
      System.out.print("Mass of the Object (Kilograms): "); 
      mass = scan.nextDouble();
      System.out.print("\nVelocity (Meters per Seconds): "); 
      seconds = scan.nextDouble();
      
      CalcKEnergy(mass, seconds);  
   } 
   
   /**
      The CalcEnergy method will apply the inputs for mass and velocity to kinetic energy formula 
      @perma mass The value for the mass of the object
      @perma seconds The value for the velocity in meters per seconds.  
   */ 
   
   public static void CalcKEnergy(double mass, double seconds) { 
      
      double ke = 0.5 * mass * (seconds * seconds); 
      System.out.printf("\nKenetic Energy: %,.1f J" ,ke); 
   } 
   
} 
      
   
      
   
     
       
      
      
import java.util.Scanner; 
/**
   This program reads an integer and outputs if a prime number or not.
*/
public class PrimeNumber { 
   public static void main(String[] args) { 
   
      Scanner in = new Scanner(System.in);
      
      String again = "Y"; 
       
      while (again.equalsIgnoreCase("Y")) { 
         GetInt();
         System.out.printf("\n\nAgain? \"Y\" or \"N\": ");
         again = in.nextLine();
      }
      
      System.out.print("\n\n\nHasta la vista, baby");    
   } 
      
      /**
         The GetInt method get an integer from the user and input validates, 
         calls PrimeTest method.  
      */ 
      
      public static void GetInt() { 
          
          Scanner scan = new Scanner(System.in); 
        
         System.out.print("\n\nEnter an Integer: ");
         int num = scan.nextInt(); 
         while (num < 2) {
            System.out.print("\nA prime number is any number that has no positive divisors other than itself, and the number 1.");
            System.out.print("\nInvalid Input");
            System.out.print("\n\nEnter an Integer: ");
            num = scan.nextInt();
         } 
         
         String result = PrimeTest(num); 
         System.out.printf("\nPrime Status: %s" ,result);
         
      }         
   
    /**
      The PrimeTest method will return true or false for if the integer
      is a prime number or not.
      @perma num The integer to be tested if prime or not. 
      @return result The value of the Boolean for prime status.  
    */
    
    public static String PrimeTest(int num) { 
      String result; 
      double divisor; 
      
      for (int i = 2; i < num; i++) {
         divisor = num % i; 
         if (divisor == 0) { 
            result = "FALSE"; 
            return result; 
         } 
      }    
      result = "TRUE"; 
      return result; 
    }
}    
    
 
         
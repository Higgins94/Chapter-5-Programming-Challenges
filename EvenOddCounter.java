import java.util.Scanner;
import java.util.Random;  
/**
   This program test if an integer is even or odd, returns results, then generates 
   100 random integers and denotes if even or odd. 
*/
public class EvenOddCounter { 
   public static void main(String[] args) { 
   
      Scanner scan = new Scanner(System.in);
      Random numR = new Random(); 
      
      String result; 
      int num; 
      System.out.print("Enter a number: "); 
      Num = scan.nextInt(); 
     
       result = IsEven(num);
       System.out.printf("%d is %s" ,userNum ,result); 
       
       for (int i = 1; i <= 100; i++) { 
         int num = numR.nextInt(); 
         result = IsEven(num);
         System.out.printf("\n%d is %s" ,num ,result);
       } 
   } 
   
   /**
   The IsEven method return Boolean true or false for even or odd. 
   @perma The value of the integer to be checked. 
   @return The Boolean evaluation. 
   */
   
   public static String IsEven(int num) {
      String result; 
      if (userNum % 2 == 0) { 
         result = "EVEN";
         return result;  
      } else { 
         result = "ODD"; 
         return result;      
      }   
   } 
} 
         
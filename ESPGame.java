import java.util.Random; 
import java.util.Scanner; 

/**
This program has the user guess what color the program is thinking of,
aka the lamest game ever. 
*/ 
public class ESPGame { 
   public static void main(String[] args) { 
   
      Scanner in = new Scanner(System.in); 
      String again = "Y";
      Guess();
      while (again.equalsIgnoreCase("Y")) { 
         System.out.print("\n\nNew Game?"); 
         System.out.print("\n(\"Y\" or \"N\"): ");
         again = in.nextLine();
         if (again.equalsIgnoreCase("Y")) {  
         Guess();
         } else
         System.out.print("\ntoodle-oo!");
      }
   } 
    /**
    The GetColor method randomly assigns a color the user must guess. 
    @return The value for the color chosen. 
    */
    
    public static String GetColor() {
    
      Random random = new Random();   
      int color; 
      color = random.nextInt(5) + 1; 
      String result; 
      if (color == 1) { 
         result = "Red"; 
         return result; 
      } else if (color == 2) { 
         result = "Green"; 
         return result; 
      } else if (color == 3) { 
         result = "Blue"; 
         return result; 
      } else if (color == 4) { 
         result ="Orange"; 
         return result; 
      } else { 
         result = "Yellow"; 
         return result; 
      } 
    } 
    
    /** 
    The Guess method takes input from user, checks against color, and keeps track of/displays correct guesses.
    */ 
    public static void Guess() {  
      
      Scanner scan = new Scanner(System.in);
      String color, guess = "";
      int correct = 0; 
      color = GetColor();  
      System.out.print("\nRed, Green, Blue, Orange, Yellow\n(Your Guess) ");
      guess = scan.nextLine(); 
      if (guess.equalsIgnoreCase(color)) {  
         System.out.printf("\nCorrect!: %s" , color);
         correct++;
      } else
         System.out.printf("\nIncorrect! The color was %s" ,color); 
       
      for (int i = 1; i <= 10; i++) { 
         color = GetColor();
         System.out.print("\nRed, Green, Blue, Orange, Yellow\n(Your Guess) ");
         guess = scan.nextLine(); 
         if (guess.equalsIgnoreCase(color)) { 
            System.out.printf("\nCorrect!" , color);
            correct++; 
         } else
         System.out.printf("\nIncorrect! The color was %s" ,color);
      }
      System.out.printf("\n\nNumber of Correct Guesses: %d" ,correct);
      if (correct == 11) { 
         System.out.print("\nWow, Amazing!"); 
      } else if (correct == 0) { 
         System.out.print("\nWow, that was terrible!"); 
      } 
      return;
   }
}   
      
         
      
            
    
    
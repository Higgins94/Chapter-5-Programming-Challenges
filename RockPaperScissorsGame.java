import java.util.Random; 
import java.util.Scanner; 
/**
This program plays Rock, Paper, Scissors with the user. 
*/
//I just slapped this bad boy into one method, did not think it 
//necessary to make muliple methods for different aspects of a Rock Paper Scissors Game.  
public class RockPaperScissorsGame { 
   public static void main(String[] args) { 
      
      Random draw = new Random(); 
      Scanner scan = new Scanner(System.in); 
      
      int again = 1, userW = 0, comW = 0, ties = 0, rounds;
      
      while (again == 1) { 
         userW = 0;
         comW = 0; 
         ties = 0;
         System.out.print("How Many Rounds? "); 
         rounds = scan.nextInt(); 
         for (int i = 1; i <= rounds; i++) {
       
            System.out.print("\n\n1. Rock\n2. Paper\n3. Scissors\n"); 
            int userPick = scan.nextInt();
            if (userPick < 1 || userPick > 3) { 
               System.out.print("\nInvalid Input\nRock Selected.\n"); 
               userPick = 1; 
            }  
      
            int computerPick = draw.nextInt(3) + 1; 
      
//Instead of having generic outputs like "Rock beats Scissors,
//I chose to just make a larger if else statements    
               
            if (userPick == 1 && computerPick == 3) { 
               System.out.print("\nYou throw Rock!\nComputer throws Scissors!\nUser Wins"); 
               userW++; 
            } else if (userPick == 3 && computerPick == 1) { 
               System.out.print("\nYou throw Scissors!\nComputer throws Rock!\nComputer Wins"); 
               comW ++;
            }  else if (userPick == 3 && computerPick == 2) { 
               System.out.print("\nYou throw Scissors!\nComputer throws Paper!\nUser Wins"); 
               userW ++;
            } else if (userPick == 2 && computerPick== 3) { 
               System.out.print("\nYou throw Paper!\nComputer throws Sissors!\nComputer Wins"); 
               comW ++;
            } else if (userPick == 2 && computerPick == 1) { 
               System.out.print("\nYou throw Paper!\nComputer throws Rock!\nUser Wins"); 
               userW ++;
            } else if (userPick == 1 && computerPick == 2) { 
               System.out.print("\nYou throw Rock!\nComputer throws Paper!\nComputer Wins"); 
               comW ++;
            } else if (userPick == 1 && computerPick == 1) { 
               System.out.print("\nYou throw Rock!\nComputer throws Rock!\nTie"); 
               ties ++;
            } else if (userPick == 2 && computerPick == 2) { 
               System.out.print("\nYou throw Paper!\nComputer throws Paper!\nTie"); 
               ties ++; 
            } else if (userPick == 3 && computerPick == 3) { 
               System.out.print("\nYou throw Scissors!\nComputer throws Scissors!\nTie"); 
               ties ++;
            } 
          
         }
         
         if (userW > comW) {
            System.out.printf("\n\nUser Wins the Game!\nUser Wins: %d\nComputer Wins: %d\nTies: %d" ,userW, comW, ties);
         } else if (comW > userW) { 
         System.out.printf("\n\nComputer Wins the Game!\nUser Wins: %d\nComputer Wins: %d\nTies: %d" ,userW, comW, ties);
         } else 
            System.out.printf("\n\nThe Game was a Tie!\nUser Wins: %d\nComputer Wins: %d\nTies: %d" ,userW, comW, ties);
         
         System.out.print("\n1. New Game\n2. Quit\n"); 
         again = scan.nextInt(); 
      } 
      
      System.out.println("Thanks for playing!");
       
   } 
      
}

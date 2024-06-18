import java.util.Scanner; 
import java.lang.Math;
/**
   This program calculates the present value needed in order to accrue enough interest, 
   over a period of time, to reach a certain monetary value. 
*/ 
public class PresentValue { 
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in); 
   
      double futureValue, numYears, interest, annualInterestRate, presentValue, input = 1; 
   
      while (input == 1) { 
         System.out.print("Desired Future Value for Account: $"); 
         futureValue = scan.nextDouble(); 
         System.out.print("\nTime to Accure Interest(Years): ");
         numYears = scan.nextDouble();
         System.out.print("Annual Interest Rate(No Decimal Fractions): %"); 
         annualInterestRate = scan.nextDouble(); 
         annualInterestRate = annualInterestRate / 100.0 + 1.0; 
      
         presentValue = CalcPV(futureValue, numYears, annualInterestRate);
         interest = futureValue - presentValue;  
         System.out.printf("\nDeposit: $%,.2f" ,presentValue);
         System.out.printf("\nTotal Interest: $%,.2f" ,interest); 
         System.out.print("\n\n1. Input Different Values\n2. Quit");
         System.out.print("\n(1 or 2): "); 
         input = scan.nextDouble(); 
          
      }
      System.out.print("\n\nbye-bye"); 
   } 
   
   /**
   The CalcPV method Calculates the present value. 
   @perma futureValue The total amount to be accrued 
   @perma numYears The number of years the deposit can accure interest.
   @perma annualInterestRate The interest rate per year. 
   @return presentValue The value for the present value. 
   */ 
   
   public static double CalcPV(double futureValue, double numYears, double annualInterestRate) { 
      double presentValue = Math.pow(annualInterestRate, numYears);
      presentValue = futureValue / presentValue;
      return presentValue; 
   } 
} 

      
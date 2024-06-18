import javax.swing.JOptionPane;  
/**
   This program will ask the user to enter the width and length of rectangle, 
   then display the recantangle's area. 
*/
public class RectangleArea { 
	public static void main(String[] args) {
   
      double length, width, area; 
      
      length = GetLength();
      width = GetWidth(); 
      area = GetArea(length, width);
      DisplayData(length, width, area); 
   } 
   
   /** 
      The GetLength method will prompt the user for the length of the rectangle.
      @return length The value that will hold the length. 
   */
   
   public static double GetLength() { 
      String input = JOptionPane.showInputDialog("Enter the length of the rectangle");
      double length = Double.parseDouble(input); 
      while (length <= 0) { 
         JOptionPane.showMessageDialog(null, "Can not have negative length"); 
         input = JOptionPane.showInputDialog("Enter the length of the rectangle");
         length = Double.parseDouble(input);
      } 
      return length; 
   } 
   
   /**
      The GetWidth method will prompt the user for the width of the rectangle.
      @return width The value that will hold the length. 
   */
   
   public static double GetWidth() {  
      String input = JOptionPane.showInputDialog("Enter the width of the rectangle");
      double width = Double.parseDouble(input); 
      while (width <= 0) { 
         JOptionPane.showMessageDialog(null, "Can not have negative width"); 
         input = JOptionPane.showInputDialog("Enter the length of the rectangle");
         width = Double.parseDouble(input); 
      } 
      return width; 
   }
   
   /**
   The GetArea method will calculate the area of the rectangle. 
   @perma length For the value for the length of the rectangle. 
   @perma width The value of the width of the rectangle.
   @return The value for the area of the rectangle. 
   */ 
   
   public static double GetArea(double length, double width) { 
      double area = length * width; 
      return area; 
   } 
   
   /** 
   The DisplayData method will display the length, width, and area to the user. 
   @perma length The value for the length of the rectangle. 
   @perma width The value for the width of the rectangle. 
   @perma area The value for the area of the rectangle. 
   */ 
   
   public static void DisplayData(double length, double width, double area) { 
      System.out.printf("A rectangle with a length of %,.2f,\n and a width of %,.2f \nwill have an area of %,.2f" ,length ,width, area); 
   } 
} 
   
   
   
      
   
   
  
      
  
       
   
            
          
       
         
         
         
       
      
          
      
            
         
      
          
         
       
      
      
      
                      
         
      
         
         
     
    
    
    
    
     
    
      
    
     
      
     
    
         
    
    
     
    
   
   
  
   
   
      
      
      
      
       
      
      
    
   
        
     
  
           
    
                                
                                
                                   
   
	
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

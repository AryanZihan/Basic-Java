//this program demonstrates the function of taking input from the user and displaying the required output

import java.util.Scanner;
  
  public class BasicInput {
   public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
     String name;
     
     System.out.println("Enter your name : ");
     name = input.nextLine();
     
     System.out.print("Your name has been registered as "+name);
   }
}  

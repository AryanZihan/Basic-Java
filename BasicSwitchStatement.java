//This Java program  demonstrates the basic usage of Switch Statements

import java.util.Scanner;

public class BasicSwitchStatement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int digit;
    
    System.out.println("Enter any digit between 0 and 5: ");
    digit = input.nextInt();
    switch(digit) {
    case 0:
      {
       System.out.print("The digit you have entered is ZERO");
       break;
      }
      case 1:
      {
       System.out.print("The digit you have entered is ONE");
       break;
      }
      case 2:
      {
       System.out.print("The digit you have entered is TWO");
       break;
      }
      case 3:
      {
       System.out.print("The digit you have entered is THREE");
       break;
      }
      case 4:
      {
       System.out.print("The digit you have entered is FOUR");
       break;
      }
      case 5:
      {
       System.out.print("The digit you have entered is FIVE");
       break;
      }
      default:
      {
       System.out.print("Sorry, you can only enter digits between 0 and 5");
      }
    }
   }
}  

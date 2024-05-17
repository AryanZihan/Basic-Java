//This Java program performs division between two numbers, taking input from the user. The quotient and remainder are indicated in separate output lines

import java.util.Scanner;
public class BasicDivision {
  public static void main(String[] args) {
  
    int num1, num2, quotient, remainder;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    num1 = input.nextInt();
    
    System.out.println("Enter second number: ");
    num2 = input.nextInt();
    
    quotient = num1 / num2;
    remainder = num1 % num2;
      
    System.out.println("The quotient is: "+quotient);
    System.out.print("The remainder is: "+remainder);
  }
}  

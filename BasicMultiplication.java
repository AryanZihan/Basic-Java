//this Java program performs multiplication between two numbers, taking input from the user

import java.util.Scanner;
public class BasicMultiplication {
  public static void main(String[] args) {
  
    int num1, num2, result;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    num1 = input.nextInt();
    
    System.out.println("Enter second number: ");
    num2 = input.nextInt();
    
    result = num1 * num2;
    
    System.out.print("The product is: "+result);
  }
}  

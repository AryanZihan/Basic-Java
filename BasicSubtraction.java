//This Java program performs subtraction between two numbers provided by the user

import java.util.Scanner;
public class BasicSubtraction {
  public static void main(String[] args) {
  
    int num1, num2, result;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    num1 = input.nextInt();
    
    System.out.println("Enter second number: ");
    num2 = input.nextInt();
    
    result = num1 - num2;
    
    System.out.print("The difference is: "+result);
  }
}  

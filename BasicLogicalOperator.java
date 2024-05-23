//this Java program demonstrates the basic application of logical operators, particularly "greater than(>)"

import java.util.Scanner;

public class BasicLogicalOperator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1, num2;
    
    System.out.println("Enter first number: ");
    num1 = input.nextInt();
    
    System.out.println("Enter second number: ");
    num2 = input.nextInt();
    
    if(num1>num2)
    {
      System.out.print(num1+"is the greater number");
    }
    
    else
    {
      System.out.print(num2+" is the greater number");
    }
  }                  
}                         
                         
 

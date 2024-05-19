//This is a Java program that detects whether the character entered by the user is a vowel or a consonant

import java.util.Scanner;
public class VowelConsonantChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    char letter;
    System.out.println("Enter any alphabet: ");
    letter = input.next().charAt(0);
    
    if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U') 
    {
      System.out.print("The entered alphabet is a vowel");
    }
    
    else if(letter >='a' && letter <='Z') 
    {
      System.out.print("The entered alphabet is a consonant");
    }
    
    else
    { 
      System.out.print("Sorry, the entered character is not an alphabet");
    }
  }
}    

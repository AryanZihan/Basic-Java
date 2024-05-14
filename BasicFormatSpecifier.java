//this program demonstrates the basic usage of format specifiers in Java

public class BasicFormatSpecifier {
  public static void main(String[] args) {
   String name;
   int age;
   char bloodgroup;
   
   name = "Aryan Zihan Khan";
   age = 18;
   bloodgroup = 'O';
   
   System.out.printf("Name : %s\n",name);
   System.out.printf("Age : %d",age);
   System.out.print(" years\n");                 
   System.out.printf("Blood group : %c",bloodgroup);
   System.out.print(" positive");                  
  }
}

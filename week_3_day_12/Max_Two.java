//1. WAP to find maximum between two numbers.
import java.util.Scanner;
class Max_Two
{
  public static void main(String[] args)
  {
    float number_1,number_2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number_1 and number_2 values");
    number_1=sc.nextFloat();
    number_2=sc.nextFloat();
    if(number_1>number_2)
    {
      System.out.print("The max of number_1 and number_2 is ="+number_1);
    }
    else
    {
      System.out.print("The max of number_2 number_2 is ="+number_2);
    }
  }
  
}

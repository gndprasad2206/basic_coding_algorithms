/*1.Write a Java program that takes three numbers from the user and prints the greatest number.

 

Test Data

Input the 1st number: 25

Input the 2nd number: 78

Input the 3rd number: 87

Expected Output :

The greatest: 87
*/
import java.util.Scanner;
class LargestOfThree{
  public int largestNumber(int num1,int num2,int num3){
    return ((num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3));
  }
}
public class GreatestOfThree{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number-1: ");
    int num1=sc.nextInt();
    System.out.print("Enter Number-2: ");
    int num2=sc.nextInt();
    System.out.print("Enter Number-3: ");
    int num3=sc.nextInt();
    LargestOfThree l=new LargestOfThree();
    System.out.println("Greatest Of Three Numbers: "+l.largestNumber(num1, num2, num3));
  }
}
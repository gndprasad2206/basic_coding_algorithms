//Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program
import java.util.Scanner;
import java.lang.Math;
class Perfect_Square{
  public static void main(String[] args){
    int number;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number:");
    number=sc.nextInt();
    double root=Math.sqrt(number);
    if(root==(int)root){
      System.out.print("the given number is a perfect square");
    }
    else{
      System.out.print("The given number is not a perfect square");
    }
  }
}
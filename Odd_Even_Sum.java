//Write a program that takes in two integers as input and outputs their sum if both the integers are even. If both integers are odd, output their product. If one of the integers is odd and the other is even, output their difference
import java.util.Scanner;
import java.lang.Math;
class Odd_Even_Sum{
  public static void main(String[] args){
    int number_1,number_2,sum=0,product=1,difference=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number_1 value");
    number_1=sc.nextInt();
    System.out.println("Enter the number_2 value");
    number_2=sc.nextInt();
    if(number_1%2==0&&number_2%2==0){
      sum=Integer.sum(number_1,number_2);
      System.out.print("The sum is ="+sum);
    }
    else if(number_1%2!=0&&number_2%2!=0){
      product=(number_1*number_2);
      System.out.print("The product is ="+product);
    }
    else{
      if(number_1>=number_2){
        difference=number_1-number_2;
      }
      else{
        difference=number_2-number_1;
      }
      System.out.print("the difference between two numbers is ="+difference);
    }
  }
}
/*write a java program that reads a integer. you need to display a menu
 
   1. checking whether number is odd
   2. checking whether number is even
   3. checking whether number is prime
   4. checking whether number is perfect
   5. quit */
import java.util.Scanner;
class Multiple_Task{
  public boolean isOdd(int number){
    if(number%2!=0)
      return true;
    else
      return false;
  }
  public boolean isEven(int number){
    if(number%2==0)
      return true;
    else
      return false;
  }
  public boolean isPrime(int number){
    int i=0,count=0;
    for(i=1;i<=number;i++){
      if(number%i==0)
        count++;
    }
    if(count==2)
      return true;
    else
      return false;
  }
  public boolean isPerfect(int number){
    int i=0,sum=0;
    for(i=1;i<number;i++){
      if(number%i==0)
        sum=sum+i;
    }
    System.out.println(sum);
    if(sum==number)
      return true;
    else
      return false;
  }
}
public class Multiple_Task_Main{
  public static void main(String[] args){
    int number,i=0;
    Scanner sc=new Scanner(System.in);
    while(i<5){
      System.out.println("Enter the number");
      number=sc.nextInt();
      System.out.println(" 1. checking whether number is odd");
      System.out.println(" 2. checking whether number is even");
      System.out.println(" 3. checking whether number is prime");
      System.out.println(" 4. checking whether number is perfect");
      System.out.println(" 5. quit");
      System.out.println("Select the any one of the option");
      i=sc.nextInt();
      Multiple_Task call=new Multiple_Task();
      switch(i){
        case 1:
          boolean b=call.isOdd(number);
          if(b)
            System.out.println("The entered number is Odd number");
          else
            System.out.println("The entered number is not a odd number");
          break;
        case 2:
          b=call.isEven(number);
          if(b)
            System.out.println("The entered number is Even number");
          else
            System.out.println("The entrered number is not Even number");
          break;
        case 3:
          b=call.isPrime(number);
          if(b)
            System.out.println("The entered number is prime number");
          else
            System.out.println("THe entered number is not a prime number");
          break;
        case 4:
          b=call.isPerfect(number);
          if(b)
            System.out.println("The entered number is perfect number");
          else
            System.out.println("The entered number is not a perfect number");
          break;
        default:
          i=5;
          System.out .println("The program was quit");
      }
    }
  }
}
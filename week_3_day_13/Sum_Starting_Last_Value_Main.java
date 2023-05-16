//write a java program to find sum of first digit and last digit of a positive integer
import java.util.Scanner;
class Sum_Starting_Last_Value{
  public void sum(int number,int sum,int digit){
    if(number>9){
      digit=number%10;
      System.out.println(digit);
      sum=sum+digit;
      while(number!=0){
        digit=number%10;
        number=number/10;
        if(number==0){
          sum=sum+digit;
        }
      }
    System.out.println("The sum of last two digits is ="+sum);
    }
    else
      System.out.println("Enter the minimum Two digits number");
  }
    
}

public class Sum_Starting_Last_Value_Main{
  public static void main(String[] args){
    int number,sum=0,digit=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    Sum_Starting_Last_Value call=new Sum_Starting_Last_Value();
    call.sum(number,sum,digit);
  }
}
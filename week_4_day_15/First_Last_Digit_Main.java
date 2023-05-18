//27. WAP to find first and last digit of a number.
import java.util.Scanner;
class First_Last_Digit{
  public void digit(int number){
    int digit;
    digit=number%10;
    System.out.println("Last digit of the number "+digit);
    while(number!=0){
      number/=10;
      if(number>0&&number<=9){
        System.out.println("First digit of the number "+number);
      }
    }
  }
}
public class First_Last_Digit_Main{
  public static void main(String[] args){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    First_Last_Digit call=new First_Last_Digit();
    call.digit(number);
  }
}
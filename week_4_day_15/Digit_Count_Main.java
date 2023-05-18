
//26. WAP to count number of digits in a number.
import java.util.Scanner;

class Digit_Count {
  public int count(int number) {
    int digit,count=0;
    while(number!=0){
      count++;
      number/=10;
    }
    return count;

  }
}

public class Digit_Count_Main {
  public static void main(String[] args) {
    int number,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    Digit_Count call=new Digit_Count();
    count=call.count(number);
    System.out.println("the digits count in a given number is "+count);
  }
}
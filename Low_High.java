//Given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)
import java.util.Scanner;
class Low_High{
  public static void main(String[] args){
    int number_1,number_2,odd=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number_1");
    number_1=sc.nextInt();
    System.out.println("Enter the number_2");
    number_2=sc.nextInt();
    if(((number_1%2!=0)&&(number_2%2!=0))||((number_1%2!=0)&&(number_2%2==0))||((number_1%2==0)&&(number_2%2!=0))){
      odd=number_1+number_2;
      odd=odd/2;
      odd=odd-(number_1-1);
    }
    else{
      odd=number_1+number_2;
      odd=odd/2;
      odd=odd-number_1;
    }
    System.out.print("Odd numbers between the two numbers is ="+odd);
  }
}

  

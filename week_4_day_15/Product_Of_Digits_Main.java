//31. WAP to calculate product of digits of a number.
import java.util.Scanner;
class Product_Of_Digits{
  public int product(int number,int product){
    while(number!=0){
      int digit=number%10;
      product*=digit;
      number/=10;
    }
    return product;
  }
}
public class Product_Of_Digits_Main{
  public static void main(String[] args){
    int number,product=1;
    Scanner sc=new Scanner(System.in);
    Product_Of_Digits call=new Product_Of_Digits();
    System.out.println("Entre the number");
    number=sc.nextInt();
    int product_1=call.product(number,product);
    System.out.println("The product of the digits in a number is: "+product_1);
  }
}
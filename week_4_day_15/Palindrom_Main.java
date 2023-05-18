//29. WAP to check whether a number is palindrome or not.
import java.util.Scanner;
class Palindrom_Number{
  public boolean is_Palindrom(int number){
    int rev=0,digit,duplicate=number;
    while(number!=0){
      digit=number%10;
      rev=(rev*10)+digit;
    }
    System.out.println(rev);
    if(rev==duplicate)
      return true;
    else
      return false;
  }
}
public class Palindrom_Main{
  public static void main(String[] args){
    int number;
    Scanner sc=new Scanner(System.in);
    Palindrom_Number call=new Palindrom_Number();
    System.out.println("Enter the numebr");
    number=sc.nextInt();
    boolean b = call.is_Palindrom(number);
    System.out.println(number);
    if(b)
      System.out.println("The given number is A palindrom");
    else
      System.out.println("The given number is not a palindrom");
  }
}
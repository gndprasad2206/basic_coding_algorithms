//26.write the java program the given number is prime or not.
import java.util.Scanner;
class Prime_Or_Not{
  public boolean isPrime(int number){
    int i=0,count=0;
    for(i=1;i<=number;i++){
      if(number%i==0){
        count++;
      }
    }
    if(count==2)
      return true;
    else
      return false;
  }
}
public class Prime_Or_Not_Main{
  public static void main(String[] args){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the the number");
    number=sc.nextInt();
    Prime_Or_Not call=new Prime_Or_Not();
    boolean b=call.isPrime(number);
    if(b)
      System.out.println("The given number "+number+" is prime number");
    else
      System.out.println("The given number "+number+" is not a prime number");
  }
}
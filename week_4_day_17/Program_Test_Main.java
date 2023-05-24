//write a java program to print all the febinocis  numbers witch are prime numbers also upto n
import java.util.Scanner;
class Program_Test{
  public boolean isprime(int number){
    int count=0;
    for(int i=1;i<=number;i++){
      if(number%i==0)
        count++;
    }
    if(count==2)
      return true;
    else
      return false;
  } 
}

public class Program_Test_Main{
  public static void main(String[] args){
    int n;
    Program_Test call=new Program_Test();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the N value");
    n=sc.nextInt();
    boolean b_1=false;
    for(int i=1;i<=n;i++){
      int f_1=0,f_2=1,fibo=0;
      for(int j=2;j<=i;j++){
        fibo =f_1+f_2;
        f_1=f_2;
        f_2=fibo;
      }
      b_1=call.isprime(fibo);
      if(fibo<=n){
        if(b_1)
          System.out.println(fibo);
      }
      }
    }
  }

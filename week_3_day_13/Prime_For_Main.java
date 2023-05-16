// write a java program to check whether a positive integer is prime or not 2. write a java program to find sum of all prime numbers from 1 to n
import java.util.Scanner;
class Prime_For{
  public boolean isPrime(int number){
    int j=1,count=0;
    for(j=1;j<=number;j++){
      if(number%j==0){
        count++;
      }
    }
    if(count==2)
      return true;
    else
      return false;
  }
}

public class Prime_For_Main{
  public static void main(String[] args){
    int n,sum=0,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    Prime_For call=new Prime_For();
    for(i=1;i<=n;i++){
      boolean b=call.isPrime(i);
      if(b){
        sum=sum+i;
      }
    }
    System.out.println("The sum of all prime numbers upto "+n+" is ="+sum);
  }
}
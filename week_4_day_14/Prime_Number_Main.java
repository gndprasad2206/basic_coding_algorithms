//WAP to find sum of all prime numbers between 1 to n.
import java.util.Scanner;
class Prime_Number{
  public boolean isPrime(int number){
    int count=0;
    for(int j=1;j<=number;j++){
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
public class Prime_Number_Main{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value");
    n=sc.nextInt();
    System.out.println("The prime numbers between 1 to "+n+" is");
    for(int i=1;i<=n;i++){
      Prime_Number call=new Prime_Number();
      boolean b=call.isPrime(i);
      if(b)
        System.out.println(i);
    }
  }
}
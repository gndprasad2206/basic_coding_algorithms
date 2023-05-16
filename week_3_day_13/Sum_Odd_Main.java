//24. WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class Sum_Odd{
  public void odd_Sum(int n,int sum,int i){
    do{
      if(i%2!=0){
        sum=sum+i;
      }
      i++;
    }
      while(i<=n);
    System.out.println("The sum of all "+n+" Even numbers ="+sum);
    
  }
}
public class Sum_Odd_Main{
  public static void main(String[] args){
    int sum=0,i=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    Sum_Odd call=new Sum_Odd();
    call.odd_Sum(n,sum,i);
  } 
}
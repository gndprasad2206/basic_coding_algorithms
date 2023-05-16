//24. WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class Sum_Odd_For{
  public boolean isOdd(int number){
    if(number%2==1){
      return true;
    }
    else
      return false;
  }
}
public class Sum_Odd_For_Main{
  public static void main(String[] args){
    int n,sum=0,i=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    Sum_Odd_For call=new Sum_Odd_For();
    for(i=1;i<=n;i++){
      boolean b=call.isOdd(i);
      if(b){
        sum=sum+i;
      } 
    }
    System.out.println("The sum of Odd numbers ="+sum);
  
}
}
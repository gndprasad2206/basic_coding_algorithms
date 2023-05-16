//22. WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class Sum{
  public void naturalNumbers(int n,int i,int sum){
    do{
      sum=sum+i;
      i++;
    }
      while(i<=n);
    System.out.println("The sum of all "+n+"  natiral numbers is = "+sum);
  }
}
public class Sum_Main{
  public static void main(String[] args){
    int n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value");
    n=sc.nextInt();
    Sum call=new Sum();
    call.naturalNumbers(n,i,sum);
  }
}
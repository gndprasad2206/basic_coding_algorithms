
//22. WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;

class Sum_For {
  public void sum(int n,int sum,int i) {
    for(i=0;i<=n;i++);{
      sum=sum+i;
    }
    System.out.println("The sum of all "+n+" natural numbers is ="+sum);

  }
}
public class Sum_For_Main{
  public static void main(String[] args){
    int n,sum=0,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    
    Sum_For call=new Sum_For();
    call.sum(n,sum,i);
  }
}
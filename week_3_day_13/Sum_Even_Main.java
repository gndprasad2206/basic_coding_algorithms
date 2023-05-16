//23. WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class Sum_Even{
  public void even_Sum(int n,int sum,int i){
    do{
      if(n%i==0){
        sum=sum+i;
      }
      i++;
    }
      while(i<=n);
    System.out.println("The Sum of all "+n+" even nunmbers ="+sum);
  }
}
public class Sum_Even_Main{
  public static void main(String[] args){
    int n,sum=0,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value ");
    n=sc.nextInt();
    Sum_Even call=new Sum_Even();
    call.even_Sum(n,sum,i);
  }
}
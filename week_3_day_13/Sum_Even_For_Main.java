//23. WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class Sum_Even_For{
  public void sum(int n,int sum,int i){
    i=1;
    for( ;i<=n;){
      if(i%2==0){
        sum=sum+i;
      }
      i++;  
    }
    System.out.println("The sum of the "+n+" even numbers is ="+sum);
    
  }
}
public class Sum_Even_For_Main{
  public static void main(String[] args){
    int n,sum=0,i=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the n vale");
    n=sc.nextInt();
    Sum_Even_For call=new Sum_Even_For();
    call.sum(n,sum,i);
  }
}
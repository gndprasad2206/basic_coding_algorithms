// WAP to check whether a number is Strong number or not.
import java.util.Scanner;
class Strong_Number_1{
  public void isStrong_Number(){
    int number,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    int duplicate=number;
    while(number!=0){
      int digit=number%10;
      int fact=1,i=2;
      for(i=2;i<=digit;i++){
        fact*=i;
      }
      sum=sum+fact;
      number/=10;
  }
    if(sum==duplicate){
      System.out.println(duplicate+" is Strong number");
    }
    else
      System.out.println(duplicate+" is not a strong number");
}
}
public class Strong_Number_1_Main{
  public static void main(String[] args){
    Strong_Number_1 call= new Strong_Number_1();
    call.isStrong_Number();
  }
}

//25. WAP to print multiplication table of any number.
import java.util.Scanner;
class Multiplication_For{
  public void table(int number,int range,int i){
    for(i=1;i<=range;i++){
      System.out.println(number+"*"+i+"="+(i*number));
    }
    
  }
}
public class Multiplication_For_Main{
  public static void main(String[] args){
    int number,range,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();
    System.out.println("Enter the range of table");
    range=sc.nextInt();
    Multiplication_For call=new Multiplication_For();
    call.table(number,range,i);
  }
}
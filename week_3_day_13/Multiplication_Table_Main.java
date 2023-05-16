//25. WAP to print multiplication table of any number.
import java.util.Scanner;
class Multiplication_Table{
  public void table(int number_1,int range_1,int i_1){
    do{
      System.out.println(number_1+"*"+i_1+"="+(number_1*i_1));
      i_1++;
    }
      while(i_1<=range_1);
  }
}
public class Multiplication_Table_Main{
  public static void main(String[] args){
    int number,range,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    number=sc.nextInt();  
    System.out.println("Enter the range of the table");
    range=sc.nextInt();
    Multiplication_Table call =new Multiplication_Table();
    call.table(number,range,i);
  
  }
}
import java.util.Scanner;
class Pos_Neg{
  public void isPositiveNegative(){
    int count_1=0,count_2=0;
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Entre the range of Array");
    range=sc.nextInt();
    int values[]=new int[range];
    for(int i=0;i<values.length;i++){
      System.out.println("Enter the "+(i+1)+" value into array"); 
      values[i]=sc.nextInt();
    }
    for(int i=0;i<values.length;i++){
      if(values[i]>0){
        count_2++;
      }
      else
        count_1++;
    }
    System.out.println("The count of Positive numbers in array "+count_2);
    System.out.println("The count of Negative numbers in array "+count_1);
  }
}
public class Pos_Neg_Main{
  public static void main(String[] args){
    Pos_Neg call=new Pos_Neg();
      call.isPositiveNegative();
  }
}

//print the positive and negative value in a array
import java.util.Scanner;
class Positive_Negative_Array{
  public boolean isPositiveNegative(int number){
    if(number>0)
      return true;
    else
      return false;
      
  }
}
public class  Positive_Negative_Array_Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of Array");
    int length=sc.nextInt();
    int values[]=new int[length];
    for(int i=0;i<values.length;i++){
      System.out.println("Enter the "+(i+1)+" value into array");
      values[i]=sc.nextInt();
    }
    Positive_Negative_Array call=new Positive_Negative_Array();
    for(int i=0;i<values.length;i++){
      int value=values[i];
      boolean b =call.isPositiveNegative(value);
      if(b)
        System.out.println("The number "+values[i]+" is Positive");
      else
        System.out.println("The number "+values[i]+" is Negative");
    }
  }
}
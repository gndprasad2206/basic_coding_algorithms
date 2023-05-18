//write a java program to find the max temperature in a week
import java.util.Scanner;
class Max_Temp{
  public double isMax(double number,double max){
    if(max>number)
      return max;
    else
      return number;
  }
}
public class Max_Temp_Main{
  public static void main(String[] args){
    double heat[]=new double[7];
    Max_Temp call=new Max_Temp();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<heat.length;i++){
      System.out.println("Enter the day "+(i+1)+" Temperatue");
      heat[i]=sc.nextDouble();
    }
    double max=heat[0];
    for(int i=1;i<heat.length;i++){
      double value=heat[i];
      max=call.isMax(value,max);
    }
    System.out.println("The maximum temperatue in a week is "+max);
  }
}
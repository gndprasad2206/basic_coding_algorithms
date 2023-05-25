import java.util.Arrays;
import java.util.Scanner;
class Min_Max_Array{
  public void minMax(int arr[]){
    Arrays.sort(arr);
    int max=arr[arr.length-1];
    int min=arr[0];
    System.out.println("The maximum stock value:"+max);
    System.out.println("The minium stock value"+min);
  }
}
public class Min_Max_Array_Main{
  public static void main(String[] args){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the stock values");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    Min_Max_Array call=new Min_Max_Array();
    call.minMax(arr);
  }
}
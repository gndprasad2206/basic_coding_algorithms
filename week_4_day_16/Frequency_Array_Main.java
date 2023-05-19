//write a program to find the frequency of array elements
import java.util.Scanner;
class Frequency_Array{
  public void count(){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the "+range+" array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int count;
    boolean visitor[]=new boolean[range];
    for(int i=0;i<range;i++){
      if(visitor[i]==true){
        continue;
      }
      count=1;
      for(int j=i+1;j<range;j++){
        if(arr[i]==arr[j]){
          count++;
          visitor[j]=true;
        }
      }
      System.out.println("frequency of "+arr[i]+" is: "+count);
    }
  }
}
public class Frequency_Array_Main{
  public static void main(String[] args){
    Frequency_Array call=new Frequency_Array();
    call.count();
  }
}
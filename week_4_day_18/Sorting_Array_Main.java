// write a java program to sort the elements of one dimensional array in ascending order
import java.util.Scanner;
class Sorting_Array{
  public void sorting(){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of the array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the "+range+" values into array");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0;i<range;i++){
      for(int j=i+1;j<range;j++){
        if(arr[i]<arr[j]){
          continue;
        }
        else{
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<range;i++){
      System.out.print(arr[i]+",");
    }
  }
}
public class Sorting_Array_Main{
  public static void main(String[] args){
    Sorting_Array call=new Sorting_Array();
    call.sorting();
  }
}
//Reverece the Array 
import java.util.Scanner;
class Reverse_Array{
  public int[] reverse(int a[]){
    int temp=0,i=0,j=a.length;
      for(i=0,j=a.length-1;i<j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    return a;
  }
}
public class Reverse_Array_Main{
  public static void main(String[] args){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("enter the array values");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    Reverse_Array call=new Reverse_Array();
    call.reverse(arr);
    System.out.println("Array after reversel");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+",");
    }
  }
}

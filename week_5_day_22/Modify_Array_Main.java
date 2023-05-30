//write the java programs to store all even numbers first then store odd numbers in given array
import java.util.Scanner;
import java.util.Arrays;
class Modify_Array{
  public void arrayElementsShift(int arr[],int k){
    int length=arr.length;
    int modified_Arr[]=new int[length];
    int modified_Arr_1[]=new int[length-k];
    int modified_Arr_2[]=new int[k];
    for(int i=0,j=k;j<length;j++,i++){
      modified_Arr_1[i]=arr[j];
    }
    for(int i=0,j=0;i<modified_Arr_2.length;i++,j++){
      modified_Arr_2[i]=arr[j];
    }
    System.arraycopy(modified_Arr_1,0,modified_Arr, 0,modified_Arr_1.length);
    System.arraycopy(modified_Arr_2,0,modified_Arr, modified_Arr_1.length, modified_Arr_2.length);
      System.out.println(Arrays.toString(modified_Arr));
    }
  }

public class Modify_Array_Main{
  public static void main(String[] args){
    int range,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of the array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the elements into array");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter k value");
    k=sc.nextInt();
    Modify_Array call=new Modify_Array();
    call.arrayElementsShift(arr,k);
  }
}
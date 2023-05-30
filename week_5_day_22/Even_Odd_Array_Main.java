//write the java programs to store all even numbers first then store odd numbers in given array
import java.util.Scanner;

import java.util.Arrays;

import java.util.Arrays;
class Even_Odd_Array{
  public void even_Odd(int arr[]){
    int evenCount=0,oddCount=0,even=0,odd=0;
    int length=arr.length;
    int modified_Arr[]=new int[length];
    for(int i=0;i<length;i++){
      if(arr[i]%2==0)
        evenCount++;
      else
        oddCount++;
    }
    System.out.println(evenCount);
    System.out.println(oddCount);
    int evenArr[]=new int[evenCount];
    int oddArr[]=new int[oddCount];
    int k=0,m=0;
    for(int i=0;i<length;i++){
      if(arr[i]%2==0){
        evenArr[k++]=arr[i];
      }
      else{
        oddArr[m++]=arr[i];
      }
    }
    System.arraycopy(evenArr, 0,modified_Arr, 0, evenArr.length);
    System.arraycopy(oddArr, 0,modified_Arr, evenArr.length, oddArr.length);
    System.out.println(Arrays.toString(modified_Arr));
    }
  }

public class Even_Odd_Array_Main{
  public static void main(String[] args){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of the array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the elements into array");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    Even_Odd_Array call=new Even_Odd_Array();
    call.even_Odd(arr);
  }
}
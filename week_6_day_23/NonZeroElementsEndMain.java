/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 
Note that you must do this in-place without making a copy of the array.
 
 
Example 1:
 
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]   */
import java.util.Scanner;
class NonZeroElementsEnd{
  public void arrayModification(int arr[]){
    int temp=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]!=0)
        continue;
        if(arr[j]!=0){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

public class NonZeroElementsEndMain{
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
    NonZeroElementsEnd call=new NonZeroElementsEnd();
    call.arrayModification(arr);
  }
}
/*Example 1:
 
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
 
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
 
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/
import java.util.Scanner;
import java.util.Arrays;
class Missing_Number{
  public int missingNumber(int arr[]){
    int number=0,missingNumber=0;
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++,number++){
      if(arr[i]!=number)
        missingNumber=number;
    }
    return missingNumber;
  }
}
public class Missing_Number_Main{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.println("Enter array values frome 0 to n");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Missing_Number call=new Missing_Number();
    int missingNumber=call.missingNumber(arr);
    System.out.println("The missig number is:"+missingNumber);
  }
}
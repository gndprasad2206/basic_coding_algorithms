//11.Write a Java program to sum values of an array.
import java.util.Scanner;
class SumOfArray{
  public int sumOfArray(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    return sum;
  }
}
public class SumOfArrayElements{
  public static void main(String[] args){
    SumOfArray sa=new SumOfArray();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Range Of Array Elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elements into Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Sum of all array Elements is: "+sa.sumOfArray(arr));
  }
}
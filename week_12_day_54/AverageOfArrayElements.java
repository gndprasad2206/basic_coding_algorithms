//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
class AverageArrayElements{
  public int averageArray(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    return (sum/arr.length);
  }
}
public class AverageOfArrayElements{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    AverageArrayElements a=new AverageArrayElements();
    System.out.println("Enter the range of the Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array Elments");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Average Of Array Elements: "+a.averageArray(arr));
  }
}
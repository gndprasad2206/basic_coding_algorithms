import java.util.Scanner;
class Sort1{
  public void bubbleSort(int arr[],int n){
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-(i+1);j++){
        if(arr[j]<arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("Array After sorting");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
public class BubbleSort1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Sort1 s=new Sort1();
    s.bubbleSort(arr, n);
  }
}
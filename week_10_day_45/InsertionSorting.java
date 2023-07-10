import java.util.Scanner;
class Sort2{
  public void insertionSort(int arr[],int n){
    for(int i=1;i<n;i++){
      for(int j=0;j<i;j++){
        if(arr[j]>arr[i]){
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    System.out.println("Array After Sorting");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
public class InsertionSorting{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Sort2 s=new Sort2();
    s.insertionSort(arr,n);
  }
}
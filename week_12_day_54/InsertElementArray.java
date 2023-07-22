/*//Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;
class InsertElement{
  public void insertElement(int arr[],int index,int key){
    int arr1[]=new int[arr.length+1];
    int k=0;
    if(index >=0&&index<=arr.length-1){
      for(int i=0;i<index;i++){
        arr1[i]=arr[i];
      }
      arr1[index]=key;
      for(int i=index+1;i<arr)
    else{
      System.out.println("Invalid Index ");
    }
  }
}
public class InsertElementArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    InsertElement ie=new InsertElement();
    System.out.println("Enter the range of array");
    int n=sc.nextInt();
    System.out.println("Entre the Array Elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element");
    int key=sc.nextInt();
    System.out.println("Enter the index value");
    int index=sc.nextInt();
    ie.insertElement(arr, index,key);
  }
}*/
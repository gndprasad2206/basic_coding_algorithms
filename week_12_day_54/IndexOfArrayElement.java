//Write a Java program to find the index of an array element.
import java.util.Scanner;
class IndexOfElement{
  public int indexOfElement(int arr[],int key){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
      }
    }
    return -1;
  }
}
public class IndexOfArrayElement{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    IndexOfElement ie=new IndexOfElement();
    System.out.println("Enter the range of Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Entre the Elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key element");
    int key=sc.nextInt();
    int index=ie.indexOfElement(arr,key);
    if(index!=-1){
      System.out.println("The index Of "+key+" is: "+index);
    }
    else{
      System.out.println("key is not found");
    }
  }
}
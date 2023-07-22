//Write a Java program to remove a specific element from an array.
import java.util.Scanner;
class DeleteElement{
  public void deleteElement(int arr[],int key){
    int arr1[]=new int[arr.length-1];
    int k=0,c=0;
    for(int i=0;i<arr.length;i++){//i=4 4<5
      if(arr[i]==key){  //arr[3]=40 30==30
        c++;
        continue;
      }
      else{
        try{
        arr1[k++]=arr[i];//arr1[k++]=arr[1]  10,20,40,50
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Key element is Not found");
        }
      }
    }
    if(c!=0){
      for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
      }
    }
  }
}
public class ArrayElementDelete{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    DeleteElement de=new DeleteElement();
    System.out.println("Enter the range of Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Entre the Elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key element");
    int key=sc.nextInt();
    de.deleteElement(arr,key);
  }
}
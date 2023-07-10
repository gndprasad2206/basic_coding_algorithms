import java.util.Scanner;
import java.util.Arrays;
class BinarySearch1{
  public int binSearch(int arr[],int key,int n){
    int min=0,max=n-1;
    while(min<=max){
      int mid=(min+max)/2;
      if(arr[mid]==key){
        return mid;
      }
      else{
        if(arr[mid]<key){
          min=mid+1;
        }
        else{
          max=mid-1;
        }
      }
    }
    return -1;
  }
}
public class BinarySearchKey{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number Of Elemnts to be Store in Array");
    int n=sc.nextInt();
    int  arr[]=new int[n];
    System.out.println("Entre the elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter key value ");
    int key=sc.nextInt();
    Arrays.sort(arr);
    BinarySearch1 bi=new BinarySearch1();
    int check=bi.binSearch(arr,key,n);
    //System.out.println(check);
    if(check!=-1){
      System.out.println("The key element "+key+" is found in index of "+check);
    }
    else{
      System.out.println(key+" is not found");
    }
  }
}
import java.util.Scanner;
class RemoveElements1{
  public void removeDuplicate(int arr[]){
    int c=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          System.out.print(arr[i]+" ");
          c++;
        }
      }
    }
    if(c==0){
      System.out.println("Do Duplicates in Array");
    }
  }
}
public class DuplicateElementsArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[7];
    System.out.println("Enter elements");
    for(int i=0;i<7;i++){
      arr[i]=sc.nextInt();
    }
    RemoveElements1 r=new RemoveElements1();
    r.removeDuplicate(arr);
  }
}
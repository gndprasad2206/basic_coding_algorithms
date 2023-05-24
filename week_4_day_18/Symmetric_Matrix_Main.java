//write a java program to find whether matrix is symmetric or not
import java.util.Scanner;
class Symmetric_Matrix{
  public void symmetric(int a[][]){
    int b[][]=new int[3][3];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++){
        b[j][i]=a[i][j];
      }
    }
    int count=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++){
        if(b[i][j]==a[i][j])
          count++;
      }
    }
    if(count==9){
      System.out.println("The given Matrix is a Symmetrical matrix");
    }
    else
      System.out.println("The given Matrix is not a Symmetrical matrix");
  }
}
public class Symmetric_Matrix_Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    System.out.println("Enter the Array Elements");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    Symmetric_Matrix call=new Symmetric_Matrix();
    call.symmetric(arr);
  }
}
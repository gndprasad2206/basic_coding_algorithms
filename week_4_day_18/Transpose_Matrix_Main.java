// write a java program to find transpose of the matrix
import java.util.Scanner;
class Transpose_Matrix{
  public void transpose(int a[][]){
    int b[][]=new int[4][4];
    for(int i=0;i<b.length;i++){
      for(int j=0;j<b[0].length;j++){
        b[j][i]=a[i][j];
      }
    }
    System.out.println("Matrix Before Transpose");
    for(int i=0;i<b.length;i++){
      for(int j=0;j<b[0].length;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Matrix After Transpose");
    for(int i=0;i<b.length;i++){
      for(int j=0;j<b[0].length;j++){
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}
public class Transpose_Matrix_Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[4][4];
    System.out.println("Enter the values into array");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    Transpose_Matrix call=new Transpose_Matrix();
    call.transpose(arr);
  }
}
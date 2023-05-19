//Addition of Matrix
import java.util.Scanner;
public class Addition_Matrix{
  public static void main(String[] args){
    int row_1,colum_1,row_2,colum_2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first matrix no.of rows and colums");
    row_1=sc.nextInt();
    colum_1=sc.nextInt();
    System.out.println("Enter the second matrix no.of rows and colums");
    row_2=sc.nextInt();
    colum_2=sc.nextInt();
    int arr_1[][]=new int[row_1][colum_1];
    int arr_2[][]=new int[row_1][colum_1];
    int arr_3[][]=new int[row_1][colum_1];
    if(row_1==row_2 && colum_1==colum_2){
      System.out.println("Enter the Matrix one values");
      for(int i=0;i<arr_1.length;i++){
        for(int j=0;j<arr_1[0].length;j++){
          arr_1[i][j]=sc.nextInt();
        }
      }
      System.out.println("Enter the Second matrix values");
      for(int i=0;i<arr_2.length;i++){
        for(int j=0;j<arr_2[0].length;j++){
          arr_2[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<arr_2.length;i++){
        for(int j=0;j<arr_2[0].length;j++){
          arr_3[i][j]=arr_1[i][j]+arr_2[i][j];
        }
      }
      System.out.println("Addition of Two matrix");
      for(int i=0;i<arr_2.length;i++){
        for(int j=0;j<arr_2[0].length;j++){
          System.out.print(arr_3[i][j]+" ");
        }
        System.out.println();
      }
    }
    else
      System.out.println("The matrix Addition is not possible");
  }
}
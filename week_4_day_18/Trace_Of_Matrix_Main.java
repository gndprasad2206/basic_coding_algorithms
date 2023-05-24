//write a java program to find the trace of a matrix
import java.util.Scanner;
class Trace_Of_Matrix{
  public void trace(){
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    System.out.println("Enter the array values");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(i==j){
          sum+=arr[i][j];
        }
      }
    }
    System.out.println("The trace of the matrix is:"+sum);
  }
}
public class Trace_Of_Matrix_Main{
  public static void main(String[] args){
    Trace_Of_Matrix call=new Trace_Of_Matrix();
    call.trace();
  }
}
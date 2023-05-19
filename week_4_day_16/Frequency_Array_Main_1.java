//duplicate and dis elements in array
import java.util.Scanner;
class Frequency_Array_1{
  public void frequency(){
    int range;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Entre the range of array");
    range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter the "+range+" array elements");
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    int count;
    boolean visited[]=new boolean[range];
    for(int i=0;i<range;i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<range;j++){
        if(arr[i]==arr[j]){
          count++;
          visited[j]=true;
        }
      }
      if(count>1){
        System.out.println("The duplicate value in array "+arr[i]);
      }
      if(count==1)
        System.out.println("The distinct values "+arr[i]);
    }
  }
}
public class Frequency_Array_Main_1{
  public static void main(String[] args){
    Frequency_Array_1 call=new Frequency_Array_1();
    call.frequency();
  }
}

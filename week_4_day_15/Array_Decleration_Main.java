//Array decleration and initialization
import java.util.Scanner;
class Array_Decleration {
     public void isArray(){
        Scanner sc=new Scanner(System.in);
        int []marks=new int[5];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the "+(i+1)+"th position value");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+",");
        }
    }
}
public class Array_Decleration_Main{
  public static void main(String[] args){
    Array_Decleration call=new Array_Decleration();
    call.isArray();
    
  }
}
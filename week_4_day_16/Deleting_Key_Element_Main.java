//60. WAP to delete an element from an array at specified position.
import java.util.Scanner;
class Deleting_Key_Element{
  public boolean doDelet(int position,int key){
    if(position!=key)
      return true;
    else
      return false;
    
  }
}
public class Deleting_Key_Element_Main{
  public static void main(String[] args){
    int range,key;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array");
    range=sc.nextInt();
    System.out.println("Enter "+range+" value of array ");
    int arr[]=new int[range];
    for(int i=0;i<range;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Entre the position want  to delet");
    key=sc.nextInt();
    Deleting_Key_Element call=new Deleting_Key_Element();
    int duplicate_arr[]=new int[range-1];
    for(int i=0,k=0;i<range;i++){
      boolean b=call.doDelet(i,key);
      if(b){
        duplicate_arr[k++]=arr[i];
      }
    }
    System.out.println("Array after deleting value");
    for(int k=0;k<range-1;k++){
      System.out.println(duplicate_arr[k]);
    }
  }
}
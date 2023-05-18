//key value searching in array
import java.util.Scanner;
class Key_Element{
  public void isKey(){
    int key,range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of the array");
    range=sc.nextInt();
    int array[]=new int[range];
    for(int i=0;i<array.length;i++){
      System.out.println("Enter the "+(i+1)+" position value");
      array[i]=sc.nextInt();
    }
    System.out.println("Enter the key value wants to search");
    key=sc.nextInt();
    int count=0;
    for(int i=0;i<array.length;i++){
      if(key==array[i]){
        System.out.println("The entered key "+key+" is in the index of "+i+" in array");
        count++;
        break;
      }
    }
    if(count==0){
      System.out.println("The entered key "+key+" is not in the  array");
    }
  }
}
public class Key_Element_Main{
  public static void main(String[] args){
    Key_Element call=new Key_Element();
    call.isKey();
  }
}
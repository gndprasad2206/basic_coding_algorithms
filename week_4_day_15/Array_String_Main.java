//Read and print the 5 cities name using array
import java.util.Scanner;
class Array_String{
  public void printString(){
    String cities[]=new String[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<cities.length;i++){
      System.out.println("Enter the "+(i+1)+ " city name");
      cities[i]=sc.nextLine();
    }
    for(int i=0;i<cities.length;i++){
      System.out.print(cities[i]+",");
    }
  }
}
public class Array_String_Main{
  public static void main(String[] args){
    Array_String call=new Array_String();
    call.printString();
  }
}
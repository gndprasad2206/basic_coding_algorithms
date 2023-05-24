// WAP to find reverse of a string.
import java.util.Scanner;
class Reverse_String{
  public void reverse(){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    int n=str.length();
    System.out.println("The Reverse of the String is:");
    for(int i=n-1;i>-1;i--){
      char ch=str.charAt(i);
      System.out.print(ch);
    }
  }
}
public class Reverse_String_Main{
  public static void main(String[] args){
    Reverse_String call=new Reverse_String();
    call.reverse();
  }
}
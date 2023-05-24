//program for finding charecter index value in a string
import java.util.Scanner;
class Finding_Char{
  public void countChar(){
    String str;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    System.out.println("Enter the charecter");
    ch=sc.next().charAt(0);
    int index=str.indexOf(ch);
    if(index>=0){
      System.out.println("The index value of the charecter is:"+index);
    }
    else
      System.out.println("The charecter is  not in the String");
  }
}
public class Finding_Char_Main{
  public static void main(String[] args){
    Finding_Char call= new Finding_Char();
    call.countChar();
  }
}
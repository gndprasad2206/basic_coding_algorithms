//program for finding charecter index value in a string
import java.util.Scanner;
class Finding_Char_1{
  public void countChar(){
    String str;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    System.out.println("Enter the charecter");
    ch=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(ch==c){
        System.out.println("The index value of the charecter is:"+i);
        count++;
      }
    }
    if(count==0)
      System.out.println("The charecter is  not in the String");
  }
}
public class Finding_Char_Main_1{
  public static void main(String[] args){
    Finding_Char_1 call= new Finding_Char_1();
    call.countChar();
  }
}
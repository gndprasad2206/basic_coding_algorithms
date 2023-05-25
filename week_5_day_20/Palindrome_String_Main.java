//write a java program to reverse the string and check whether it is palindrome or not
import java.util.Scanner;
class Palindrome_String{
  public void isPalindrome(String str){
    String s1="";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      s1=ch+s1;
    }
    boolean b=s1.equals(str);
    if(b)
      System.out.println("The given string is a palindrome");
    else
      System.out.println("The given string is not a palindrome");
  }
}
public class Palindrome_String_Main{
  public static void main(String[] args){
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    Palindrome_String call=new Palindrome_String();
    call.isPalindrome(str);
  }
}